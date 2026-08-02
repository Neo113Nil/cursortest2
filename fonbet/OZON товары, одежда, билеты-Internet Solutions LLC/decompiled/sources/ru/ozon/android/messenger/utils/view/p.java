package ru.ozon.android.messenger.utils.view;

import android.text.SpannableString;
import android.widget.TextView;
import androidx.core.text.g;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.view.TextViewExtKt$precomputeText$2", f = "TextViewExt.kt", l = {213}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class p extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f92015d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ CharSequence f92016e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ TextView f92017f;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.view.TextViewExtKt$precomputeText$2$precomputedTextCompat$1", f = "TextViewExt.kt", l = {}, m = "invokeSuspend")
    static final class a extends kotlin.coroutines.jvm.internal.j implements Function2<M, kotlin.coroutines.d<? super androidx.core.text.g>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ TextView f92018d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ CharSequence f92019e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(TextView textView, CharSequence charSequence, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f92018d = textView;
            this.f92019e = charSequence;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f92018d, this.f92019e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super androidx.core.text.g> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            Sc.s.b(obj);
            g.b a11 = androidx.core.widget.k.a(this.f92018d);
            Intrinsics.checkNotNullExpressionValue(a11, "getTextMetricsParams(...)");
            return androidx.core.text.g.a(this.f92019e, a11);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    p(TextView textView, CharSequence charSequence, kotlin.coroutines.d dVar) {
        super(2, dVar);
        this.f92016e = charSequence;
        this.f92017f = textView;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new p(this.f92017f, this.f92016e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((p) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f92015d;
        TextView textView = this.f92017f;
        if (i11 == 0) {
            Sc.s.b(obj);
            CharSequence charSequence = this.f92016e;
            if (charSequence == null) {
                return Unit.f71690a;
            }
            He.c a11 = C10720e0.a();
            a aVar2 = new a(textView, charSequence, null);
            this.f92015d = 1;
            obj = C10727i.f(a11, aVar2, this);
            if (obj == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        androidx.core.text.g gVar = (androidx.core.text.g) obj;
        Intrinsics.f(gVar);
        textView.setText(SpannableString.valueOf(gVar));
        return Unit.f71690a;
    }
}
