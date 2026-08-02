package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.RelativeLayout;
import com.sofascore.results.R;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tcg extends RelativeLayout {
    public final tcg a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tcg(Context context) {
        super(context);
        context.getClass();
        LayoutInflater.from(context).inflate(R.layout.sas_customer_feedback_button_layout, this);
        setLayoutParams(new RelativeLayout.LayoutParams(-2, -2));
        this.a = this;
    }

    @NotNull
    public View getView() {
        return this.a;
    }

    public void setClickListener(@Nullable View.OnClickListener onClickListener) {
        View findViewById = findViewById(R.id.clickable_area);
        if (findViewById != null) {
            findViewById.setOnClickListener(onClickListener);
        }
    }
}
