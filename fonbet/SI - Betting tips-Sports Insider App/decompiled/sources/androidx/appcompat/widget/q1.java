package androidx.appcompat.widget;

import android.text.StaticLayout;
import android.widget.TextView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q1 extends p1 {
    @Override // androidx.appcompat.widget.p1, androidx.appcompat.widget.r1
    public void a(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection(textView.getTextDirectionHeuristic());
    }

    @Override // androidx.appcompat.widget.r1
    public boolean b(TextView textView) {
        return textView.isHorizontallyScrollable();
    }
}
