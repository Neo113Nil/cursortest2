package j1;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import com.google.android.gms.internal.measurement.h4;
import j$.util.stream.IntStream;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f18245a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f18246b;

    public x(Spannable spannable) {
        this.f18246b = spannable;
    }

    public final void a() {
        Spannable spannable = this.f18246b;
        if (!this.f18245a) {
            if ((Build.VERSION.SDK_INT < 28 ? new y8.d() : new w()).n(spannable)) {
                this.f18246b = new SpannableString(spannable);
            }
        }
        this.f18245a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i5) {
        return this.f18246b.charAt(i5);
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ IntStream chars() {
        return IntStream.Wrapper.convert(chars());
    }

    @Override // java.lang.CharSequence
    public /* synthetic */ java.util.stream.IntStream codePoints() {
        return IntStream.Wrapper.convert(codePoints());
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f18246b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f18246b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f18246b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i5, int i10, Class cls) {
        return this.f18246b.getSpans(i5, i10, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f18246b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i5, int i10, Class cls) {
        return this.f18246b.nextSpanTransition(i5, i10, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f18246b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i5, int i10, int i11) {
        a();
        this.f18246b.setSpan(obj, i5, i10, i11);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i5, int i10) {
        return this.f18246b.subSequence(i5, i10);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f18246b.toString();
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream chars() {
        return h4.a(this.f18246b);
    }

    @Override // java.lang.CharSequence
    public final j$.util.stream.IntStream codePoints() {
        return h4.b(this.f18246b);
    }
}
