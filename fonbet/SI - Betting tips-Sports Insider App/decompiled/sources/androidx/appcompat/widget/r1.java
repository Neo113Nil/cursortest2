package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class r1 {
    public abstract void a(StaticLayout.Builder builder, TextView textView);

    public boolean b(TextView textView) {
        return ((Boolean) s1.e(textView, Boolean.FALSE, "getHorizontallyScrolling")).booleanValue();
    }
}
