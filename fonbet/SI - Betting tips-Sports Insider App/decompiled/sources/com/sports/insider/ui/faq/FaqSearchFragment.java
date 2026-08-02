package com.sports.insider.ui.faq;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import fe.b;
import fe.c;
import i3.i;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import jc.e;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.d0;
import kotlin.text.n;
import te.q;
import u6.h;
import y1.j;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006²\u0006\f\u0010\u0005\u001a\u00020\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sports/insider/ui/faq/FaqSearchFragment;", "Lcom/sports/insider/ui/faq/FaqFragment;", "<init>", "()V", "Ltd/c;", "safeArgs", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nFaqSearchFragment.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FaqSearchFragment.kt\ncom/sports/insider/ui/faq/FaqSearchFragment\n+ 2 FragmentNavArgsLazy.kt\nandroidx/navigation/fragment/FragmentNavArgsLazyKt\n*L\n1#1,27:1\n42#2,3:28\n*S KotlinDebug\n*F\n+ 1 FaqSearchFragment.kt\ncom/sports/insider/ui/faq/FaqSearchFragment\n*L\n15#1:28,3\n*E\n"})
/* loaded from: classes.dex */
public final class FaqSearchFragment extends FaqFragment {

    /* renamed from: b, reason: collision with root package name */
    public String f6908b;

    @Override // com.sports.insider.ui.faq.FaqFragment
    public final void F() {
        Character x10;
        q qVar;
        String value;
        c G = G();
        String str = this.f6908b;
        WeakReference weakContext = new WeakReference(getContext());
        b bVar = (b) G;
        bVar.getClass();
        Intrinsics.checkNotNullParameter(weakContext, "weakContext");
        if (str == null) {
            return;
        }
        ArrayList arrayList = null;
        try {
            n a7 = Regex.a(new Regex("[A-я]+"), str);
            if (a7 == null || (value = a7.getValue()) == null) {
                n a10 = Regex.a(new Regex("[0-9]+"), str);
                value = a10 != null ? a10.getValue() : null;
            }
            if (value == null || (x10 = d0.x(value)) == null) {
                x10 = d0.x(str);
            }
        } catch (Exception unused) {
            x10 = d0.x(str);
        }
        if (x10 == null || ((Context) weakContext.get()) == null) {
            return;
        }
        Context context = (Context) weakContext.get();
        if (context != null) {
            ArrayList g10 = bVar.g();
            arrayList = new ArrayList();
            Iterator it = g10.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (next instanceof jc.c) {
                    String string = context.getString(((jc.c) next).f18426a);
                    Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
                    char charValue = x10.charValue();
                    Intrinsics.checkNotNullParameter(string, "<this>");
                    if (StringsKt.F(string, charValue, 0, true, 2) >= 0) {
                        arrayList.add(next);
                    }
                }
                if (next instanceof e) {
                    arrayList.add(next);
                }
            }
        }
        if (arrayList == null || arrayList.isEmpty()) {
            arrayList = bVar.g();
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!(obj instanceof e)) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty() || (qVar = bVar.f9615m) == null) {
            return;
        }
        qVar.f(arrayList);
    }

    @Override // com.sports.insider.ui.faq.FaqFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f6908b = null;
    }

    @Override // com.sports.insider.ui.faq.FaqFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        ag.c navArgsClass = Reflection.getOrCreateKotlinClass(td.c.class);
        i argumentProducer = new i(13, this);
        Intrinsics.checkNotNullParameter(navArgsClass, "navArgsClass");
        Intrinsics.checkNotNullParameter(argumentProducer, "argumentProducer");
        Bundle bundle2 = (Bundle) argumentProducer.invoke();
        s.e eVar = j.f25572b;
        Method method = (Method) eVar.get(navArgsClass);
        if (method == null) {
            method = h.k(navArgsClass).getMethod("fromBundle", (Class[]) Arrays.copyOf(j.f25571a, 1));
            eVar.put(navArgsClass, method);
            Intrinsics.checkNotNullExpressionValue(method, "also(...)");
        }
        Object invoke = method.invoke(null, bundle2);
        Intrinsics.checkNotNull(invoke, "null cannot be cast to non-null type Args of androidx.navigation.NavArgsLazy");
        this.f6908b = ((td.c) ((y1.i) invoke)).a();
    }
}
