package ru.ozon.android.messenger.blocks.ratemessenger;

import android.view.View;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.framework.navigation.action.d;
import ru.ozon.android.messenger.utils.view.s;
import ru.ozon.app.android.messenger.databinding.MRateMessengerBlockBinding;
import ru.ozon.uni.android.atom.labelRating.LabelRatingView;

/* loaded from: classes10.dex */
final class g extends AbstractC7737t implements Function1<Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ c f86121b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ MRateMessengerBlockBinding f86122c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ b f86123d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    g(c cVar, MRateMessengerBlockBinding mRateMessengerBlockBinding, b bVar) {
        super(1);
        this.f86121b = cVar;
        this.f86122c = mRateMessengerBlockBinding;
        this.f86123d = bVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(Integer num) {
        boolean z11;
        Object obj;
        Object obj2;
        LinkedHashMap linkedHashMap;
        boolean z12;
        int intValue = num.intValue();
        final c cVar = this.f86121b;
        z11 = cVar.f86103e;
        if (!z11) {
            cVar.u();
        }
        cVar.getBinding().messageEditText.clearFocus();
        MRateMessengerBlockBinding mRateMessengerBlockBinding = this.f86122c;
        TextInputLayout messageTextInputLayout = mRateMessengerBlockBinding.messageTextInputLayout;
        Intrinsics.checkNotNullExpressionValue(messageTextInputLayout, "messageTextInputLayout");
        s.d(messageTextInputLayout);
        mRateMessengerBlockBinding.messageEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: ru.ozon.android.messenger.blocks.ratemessenger.e
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z13) {
                if (z13) {
                    c.this.f86099a.c().q(ru.ozon.android.messenger.framework.navigation.action.b.c(ru.ozon.android.messenger.utils.a.a(ru.ozon.android.messenger.framework.navigation.action.g.HIDE_POP_UP_ALERT)));
                }
            }
        });
        LabelRatingView ratingBar = cVar.getBinding().ratingBar;
        Intrinsics.checkNotNullExpressionValue(ratingBar, "ratingBar");
        s.f(ratingBar, f.f86120b);
        mRateMessengerBlockBinding.ratingBar.setContentDescription("rbRateMessenger_" + intValue);
        b bVar = this.f86123d;
        List<j> f7 = bVar.f();
        Iterator<T> it = f7.iterator();
        while (true) {
            obj = null;
            if (!it.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it.next();
            if (((j) obj2).a() == intValue) {
                break;
            }
        }
        j jVar = (j) obj2;
        if (jVar == null) {
            Iterator<T> it2 = f7.iterator();
            if (it2.hasNext()) {
                obj = it2.next();
                if (it2.hasNext()) {
                    int a11 = ((j) obj).a();
                    do {
                        Object next = it2.next();
                        int a12 = ((j) next).a();
                        if (a11 < a12) {
                            obj = next;
                            a11 = a12;
                        }
                    } while (it2.hasNext());
                }
            }
            jVar = (j) obj;
            if (jVar == null) {
                throw new IllegalStateException(("Unable to find rate for " + intValue).toString());
            }
        }
        c.p(cVar, jVar);
        cVar.t(bVar.g());
        Integer valueOf = Integer.valueOf(intValue);
        linkedHashMap = cVar.f86101c;
        linkedHashMap.put(d.c.RATE.a(), valueOf);
        z12 = cVar.f86104f;
        if (z12) {
            cVar.f86099a.c().s(bVar.i());
            cVar.f86104f = false;
        }
        return Unit.f71690a;
    }
}
