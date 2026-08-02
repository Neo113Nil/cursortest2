package com.google.firebase.concurrent;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.by0;
import defpackage.cp4;
import defpackage.d2a;
import defpackage.i7b;
import defpackage.iy1;
import defpackage.jb3;
import defpackage.kb3;
import defpackage.kc3;
import defpackage.koa;
import defpackage.oif;
import defpackage.s9k;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final koa a = new koa(new kc3(1));
    public static final koa b = new koa(new kc3(2));
    public static final koa c = new koa(new kc3(3));
    public static final koa d = new koa(new kc3(4));

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List getComponents() {
        oif oifVar = new oif(by0.class, ScheduledExecutorService.class);
        oif[] oifVarArr = {new oif(by0.class, ExecutorService.class), new oif(by0.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(oifVar);
        for (int i = 0; i < 2; i++) {
            d2a.r(oifVarArr[i], "Null interface");
        }
        Collections.addAll(hashSet, oifVarArr);
        kb3 kb3Var = new kb3(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new cp4(23), hashSet3);
        oif oifVar2 = new oif(iy1.class, ScheduledExecutorService.class);
        oif[] oifVarArr2 = {new oif(iy1.class, ExecutorService.class), new oif(iy1.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(oifVar2);
        for (int i2 = 0; i2 < 2; i2++) {
            d2a.r(oifVarArr2[i2], "Null interface");
        }
        Collections.addAll(hashSet4, oifVarArr2);
        kb3 kb3Var2 = new kb3(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new cp4(24), hashSet6);
        oif oifVar3 = new oif(i7b.class, ScheduledExecutorService.class);
        oif[] oifVarArr3 = {new oif(i7b.class, ExecutorService.class), new oif(i7b.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(oifVar3);
        for (int i3 = 0; i3 < 2; i3++) {
            d2a.r(oifVarArr3[i3], "Null interface");
        }
        Collections.addAll(hashSet7, oifVarArr3);
        kb3 kb3Var3 = new kb3(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new cp4(25), hashSet9);
        jb3 a2 = kb3.a(new oif(s9k.class, Executor.class));
        a2.f = new cp4(26);
        return Arrays.asList(kb3Var, kb3Var2, kb3Var3, a2.b());
    }
}
