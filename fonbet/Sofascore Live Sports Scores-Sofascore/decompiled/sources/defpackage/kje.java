package defpackage;

import android.app.RemoteAction;
import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.textclassifier.TextClassification;
import android.view.textclassifier.TextClassifier;
import androidx.compose.runtime.e;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kje implements eje {
    public final CoroutineContext a;
    public final Context b;
    public final u2h c;
    public final eib d;
    public TextClassifier f;
    public final j2d e = new j2d();
    public final e1d g = e.f(null);
    public final Object h = new Object();

    public kje(CoroutineContext coroutineContext, Context context, u2h u2hVar, eib eibVar) {
        this.a = coroutineContext;
        this.b = context;
        this.c = u2hVar;
        this.d = eibVar;
    }

    public final void a(d8j d8jVar, CharSequence charSequence, long j, Function1 function1) {
        j2d j2dVar = this.e;
        TextClassification textClassification = null;
        if (j2dVar.g()) {
            b8j b8jVar = (b8j) ((eoh) this.g).getValue();
            TextClassification textClassification2 = (b8jVar != null && pej.c(j, b8jVar.b) && Intrinsics.c(charSequence, b8jVar.a)) ? b8jVar.c : null;
            j2dVar.f(null);
            textClassification = textClassification2;
        }
        if (textClassification == null) {
            function1.invoke(d8jVar);
            return;
        }
        boolean isEmpty = textClassification.getActions().isEmpty();
        Object obj = this.h;
        if (!isEmpty) {
            d8jVar.a.a(new s8j(obj, textClassification, 0));
        } else if ((textClassification.getIcon() != null || !TextUtils.isEmpty(textClassification.getLabel())) && (textClassification.getIntent() != null || textClassification.getOnClickListener() != null)) {
            d8jVar.a.a(new s8j(obj, textClassification, -1));
        }
        function1.invoke(d8jVar);
        List<RemoteAction> actions = textClassification.getActions();
        int size = actions.size();
        for (int i = 0; i < size; i++) {
            actions.get(i);
            if (i > 0) {
                d8jVar.a.a(new s8j(obj, textClassification, i));
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0081 A[Catch: all -> 0x009c, TryCatch #1 {all -> 0x009c, blocks: (B:24:0x0076, B:26:0x0081, B:28:0x0089, B:32:0x0096, B:36:0x009e), top: B:23:0x0076 }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(CharSequence charSequence, long j, TextClassifier textClassifier, sq3 sq3Var) {
        fje fjeVar;
        lu3 lu3Var;
        int i;
        j2d j2dVar;
        long j2;
        CharSequence charSequence2;
        TextClassifier textClassifier2;
        j2d j2dVar2;
        b8j b8jVar;
        TextClassification classifyText;
        long j3;
        CharSequence charSequence3;
        try {
            if (sq3Var instanceof fje) {
                fjeVar = (fje) sq3Var;
                int i2 = fjeVar.x;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    fjeVar.x = i2 - Integer.MIN_VALUE;
                    Object obj = fjeVar.v;
                    lu3Var = lu3.a;
                    i = fjeVar.x;
                    e1d e1dVar = this.g;
                    j2dVar = this.e;
                    if (i != 0) {
                        y6a.M(obj);
                        fjeVar.r = charSequence;
                        fjeVar.s = textClassifier;
                        fjeVar.t = j2dVar;
                        j2 = j;
                        fjeVar.u = j2;
                        fjeVar.x = 1;
                        if (j2dVar.e(fjeVar) != lu3Var) {
                            charSequence2 = charSequence;
                            textClassifier2 = textClassifier;
                            j2dVar2 = j2dVar;
                        }
                        return lu3Var;
                    }
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        j3 = fjeVar.u;
                        j2dVar = fjeVar.t;
                        classifyText = (TextClassification) fjeVar.s;
                        charSequence3 = fjeVar.r;
                        y6a.M(obj);
                        try {
                            ((eoh) e1dVar).setValue(new b8j(charSequence3, j3, classifyText));
                            Unit unit = Unit.a;
                            j2dVar.f(null);
                            return Unit.a;
                        } finally {
                        }
                    }
                    j2 = fjeVar.u;
                    j2dVar2 = fjeVar.t;
                    textClassifier2 = (TextClassifier) fjeVar.s;
                    charSequence2 = fjeVar.r;
                    y6a.M(obj);
                    b8jVar = (b8j) ((eoh) e1dVar).getValue();
                    if (b8jVar != null) {
                        if (pej.c(j2, b8jVar.b) && Intrinsics.c(charSequence2, b8jVar.a)) {
                            return Unit.a;
                        }
                    }
                    Unit unit2 = Unit.a;
                    j2dVar.f(null);
                    classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, pej.g(j2), pej.f(j2)).setDefaultLocales(c()).build());
                    fjeVar.r = charSequence2;
                    fjeVar.s = classifyText;
                    fjeVar.t = j2dVar;
                    fjeVar.u = j2;
                    fjeVar.x = 2;
                    if (j2dVar.e(fjeVar) != lu3Var) {
                        j3 = j2;
                        charSequence3 = charSequence2;
                        ((eoh) e1dVar).setValue(new b8j(charSequence3, j3, classifyText));
                        Unit unit3 = Unit.a;
                        j2dVar.f(null);
                        return Unit.a;
                    }
                    return lu3Var;
                }
            }
            b8jVar = (b8j) ((eoh) e1dVar).getValue();
            if (b8jVar != null) {
            }
            Unit unit22 = Unit.a;
            j2dVar.f(null);
            classifyText = textClassifier2.classifyText(new TextClassification.Request.Builder(charSequence2, pej.g(j2), pej.f(j2)).setDefaultLocales(c()).build());
            fjeVar.r = charSequence2;
            fjeVar.s = classifyText;
            fjeVar.t = j2dVar;
            fjeVar.u = j2;
            fjeVar.x = 2;
            if (j2dVar.e(fjeVar) != lu3Var) {
            }
            return lu3Var;
        } finally {
        }
        fjeVar = new fje(this, sq3Var);
        Object obj2 = fjeVar.v;
        lu3Var = lu3.a;
        i = fjeVar.x;
        e1d e1dVar2 = this.g;
        j2dVar = this.e;
        if (i != 0) {
        }
    }

    public final LocaleList c() {
        eib eibVar = this.d;
        if (eibVar == null) {
            return new LocaleList(pie.a.P().c().a);
        }
        ArrayList arrayList = new ArrayList(k13.r(eibVar, 10));
        Iterator it = eibVar.a.iterator();
        while (it.hasNext()) {
            arrayList.add(((dib) it.next()).a);
        }
        Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
        return new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
    }

    public final Object d(CharSequence charSequence, long j, hoi hoiVar) {
        if (charSequence.length() == 0 || pej.d(j)) {
            return Unit.a;
        }
        return xw3.R(this.a, new ije(this, new h2(this, charSequence, j, (rq3) null, 3), null), hoiVar);
    }
}
