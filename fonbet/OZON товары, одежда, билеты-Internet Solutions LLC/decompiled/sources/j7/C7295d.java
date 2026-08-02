package j7;

import android.util.Property;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* renamed from: j7.d, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7295d extends Property<ViewGroup, Float> {

    /* renamed from: a, reason: collision with root package name */
    public static final C7295d f69469a = new C7295d(Float.class, "childrenAlpha");

    @Override // android.util.Property
    @NonNull
    public final Float get(@NonNull ViewGroup viewGroup) {
        Float f7 = (Float) viewGroup.getTag(R.id.mtrl_internal_children_alpha_tag);
        return f7 != null ? f7 : Float.valueOf(1.0f);
    }

    @Override // android.util.Property
    public final void set(@NonNull ViewGroup viewGroup, @NonNull Float f7) {
        ViewGroup viewGroup2 = viewGroup;
        Float f11 = f7;
        float floatValue = f11.floatValue();
        viewGroup2.setTag(R.id.mtrl_internal_children_alpha_tag, f11);
        int childCount = viewGroup2.getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            viewGroup2.getChildAt(i11).setAlpha(floatValue);
        }
    }
}
