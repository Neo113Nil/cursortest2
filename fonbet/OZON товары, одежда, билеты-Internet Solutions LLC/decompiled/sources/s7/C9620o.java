package s7;

import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.appbar.MaterialToolbar;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: s7.o, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9620o {

    /* renamed from: a, reason: collision with root package name */
    private static final Comparator<View> f98343a = new a();

    /* renamed from: s7.o$a */
    final class a implements Comparator<View> {
        @Override // java.util.Comparator
        public final int compare(View view, View view2) {
            return view.getTop() - view2.getTop();
        }
    }

    public static TextView a(@NonNull MaterialToolbar materialToolbar) {
        ArrayList b11 = b(materialToolbar, materialToolbar.getSubtitle());
        if (b11.isEmpty()) {
            return null;
        }
        return (TextView) Collections.max(b11, f98343a);
    }

    private static ArrayList b(@NonNull MaterialToolbar materialToolbar, CharSequence charSequence) {
        ArrayList arrayList = new ArrayList();
        for (int i11 = 0; i11 < materialToolbar.getChildCount(); i11++) {
            View childAt = materialToolbar.getChildAt(i11);
            if (childAt instanceof TextView) {
                TextView textView = (TextView) childAt;
                if (TextUtils.equals(textView.getText(), charSequence)) {
                    arrayList.add(textView);
                }
            }
        }
        return arrayList;
    }

    public static TextView c(@NonNull MaterialToolbar materialToolbar) {
        ArrayList b11 = b(materialToolbar, materialToolbar.getTitle());
        if (b11.isEmpty()) {
            return null;
        }
        return (TextView) Collections.min(b11, f98343a);
    }
}
