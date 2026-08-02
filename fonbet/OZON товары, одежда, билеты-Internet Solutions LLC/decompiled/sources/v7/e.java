package v7;

import a10.AbstractC4920h;
import android.content.Context;
import android.graphics.Typeface;
import android.text.TextPaint;
import androidx.annotation.NonNull;

/* loaded from: classes9.dex */
final class e extends AbstractC4920h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ Context f102468a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ TextPaint f102469b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ AbstractC4920h f102470c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ d f102471d;

    e(d dVar, Context context, TextPaint textPaint, AbstractC4920h abstractC4920h) {
        this.f102471d = dVar;
        this.f102468a = context;
        this.f102469b = textPaint;
        this.f102470c = abstractC4920h;
    }

    @Override // a10.AbstractC4920h
    public final void a(int i11) {
        this.f102470c.a(i11);
    }

    @Override // a10.AbstractC4920h
    public final void b(@NonNull Typeface typeface, boolean z11) {
        this.f102471d.m(this.f102468a, this.f102469b, typeface);
        this.f102470c.b(typeface, z11);
    }
}
