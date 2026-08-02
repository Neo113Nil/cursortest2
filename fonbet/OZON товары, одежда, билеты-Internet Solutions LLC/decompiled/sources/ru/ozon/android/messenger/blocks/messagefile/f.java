package ru.ozon.android.messenger.blocks.messagefile;

import android.text.Layout;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;

/* loaded from: classes10.dex */
public final class f implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AppCompatTextView f85715a;

    public f(AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2) {
        this.f85715a = appCompatTextView2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int length;
        AppCompatTextView appCompatTextView = this.f85715a;
        Layout layout = appCompatTextView.getLayout();
        if (layout != null && layout.getLineCount() > 1) {
            String obj = layout.getText().toString();
            int length2 = obj.length();
            if (h.m(obj, new String[]{"."}, 0, 6).size() == 1 || (length = ((String) C7714v.X(h.m(obj, new String[]{"."}, 0, 6))).length() + 6) > length2) {
                return;
            }
            String substring = obj.substring(length2 - length, length2);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            String b11 = Nk.a.b("...", substring);
            int lineEnd = layout.getLineEnd(0) - b11.length();
            if (lineEnd >= 0) {
                appCompatTextView.setText(h.a0(obj, lineEnd, length2, b11).toString());
            }
        }
    }
}
