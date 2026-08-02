package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.sofascore.model.mvvm.model.StageSeason;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class b8i extends w7 {
    @Override // defpackage.w7
    public final View b(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object a;
        StageSeason stageSeason = (StageSeason) obj;
        context.getClass();
        viewGroup.getClass();
        stageSeason.getClass();
        if (view == null || (a = view.getTag()) == null) {
            a = nza.a(LayoutInflater.from(context), viewGroup);
        }
        TextView textView = ((nza) a).a;
        textView.setText(stageSeason.getYear());
        return textView;
    }

    @Override // defpackage.w7
    public final View c(Context context, ViewGroup viewGroup, Object obj, View view) {
        Object a;
        StageSeason stageSeason = (StageSeason) obj;
        context.getClass();
        viewGroup.getClass();
        stageSeason.getClass();
        if (view == null || (a = view.getTag()) == null) {
            a = mza.a(LayoutInflater.from(context), viewGroup);
        }
        mza mzaVar = (mza) a;
        mzaVar.b.setText(stageSeason.getYear());
        FrameLayout frameLayout = mzaVar.a;
        frameLayout.getClass();
        return frameLayout;
    }
}
