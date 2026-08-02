package com.sofascore.results.fantasy.onboarding.steps;

import com.sofascore.model.fantasy.FantasyCompetitionType;
import com.sofascore.results.fantasy.onboarding.steps.FantasyOnboardingStepsNavigation;
import defpackage.ev6;
import defpackage.fdi;
import defpackage.hc9;
import defpackage.hoi;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.pb7;
import defpackage.rq3;
import defpackage.wb7;
import defpackage.xbb;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.ListIterator;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class g extends hoi implements Function2 {
    public final /* synthetic */ String r;
    public final /* synthetic */ wb7 s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(String str, wb7 wb7Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = str;
        this.s = wb7Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new g(this.r, this.s, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((g) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x004a, code lost:
    
        if (com.sofascore.results.fantasy.onboarding.steps.a.b(r1, r6) == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        r5 = (java.lang.Integer) defpackage.tub.o(r7).get(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00a6, code lost:
    
        if (r5 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00a8, code lost:
    
        r5 = r5.intValue();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00ae, code lost:
    
        r5 = -1;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object value;
        pb7 pb7Var;
        int size;
        int i;
        Boolean bool;
        lu3 lu3Var = lu3.a;
        y6a.M(obj);
        String str = this.r;
        if (str != null) {
            wb7 wb7Var = this.s;
            fdi fdiVar = wb7Var.j;
            do {
                value = fdiVar.getValue();
                pb7Var = (pb7) value;
                FantasyOnboardingStepsNavigation fantasyOnboardingStepsNavigation = pb7Var.b;
                FantasyOnboardingStepsNavigation.SelectCompetition selectCompetition = FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE;
                boolean z = true;
                boolean z2 = !Intrinsics.c(fantasyOnboardingStepsNavigation, selectCompetition);
                int i2 = 0;
                if (!wb7Var.i) {
                    ev6 ev6Var = pb7Var.f;
                    if (ev6Var != null) {
                        bool = Boolean.valueOf(ev6Var.d == FantasyCompetitionType.WEEKLY);
                    } else {
                        bool = null;
                    }
                    if (Intrinsics.c(bool, Boolean.TRUE)) {
                        FantasyOnboardingStepsNavigation.Companion.getClass();
                    }
                    z = false;
                }
                FantasyOnboardingStepsNavigation.Companion.getClass();
                size = a.a(z2, z).size();
                String g0 = StringsKt.g0(str, '/');
                xbb a = a.a(z2, z);
                a.getClass();
                ArrayList arrayList = new ArrayList();
                ListIterator listIterator = a.listIterator(0);
                while (true) {
                    hc9 hc9Var = (hc9) listIterator;
                    if (!hc9Var.hasNext()) {
                        break;
                    }
                    Object next = hc9Var.next();
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        kotlin.collections.b.q();
                        throw null;
                    }
                    String str2 = (String) next;
                    Pair pair = str2 != null ? new Pair(str2, Integer.valueOf(i2)) : null;
                    if (pair != null) {
                        arrayList.add(pair);
                    }
                    i2 = i3;
                }
            } while (!fdiVar.k(value, pb7.a(pb7Var, null, null, size, i, null, null, null, null, null, null, 0, 0.0d, 0.0d, false, null, false, null, false, null, false, null, null, 8388595)));
            a aVar = FantasyOnboardingStepsNavigation.Companion;
            FantasyOnboardingStepsNavigation.SelectCompetition selectCompetition2 = FantasyOnboardingStepsNavigation.SelectCompetition.INSTANCE;
            aVar.getClass();
            if (a.b(str, selectCompetition2)) {
                wb7Var.t();
            }
        }
        return Unit.a;
    }
}
