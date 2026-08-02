package com.google.firebase.concurrent;

import android.annotation.SuppressLint;
import com.google.firebase.components.ComponentRegistrar;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import xsna.a4q;
import xsna.b4q;
import xsna.b6z;
import xsna.cqy;
import xsna.g0q0;
import xsna.i8i;
import xsna.pf7;
import xsna.toe0;
import xsna.upj;
import xsna.vu5;
import xsna.w3q;
import xsna.wv5;
import xsna.x3q;
import xsna.y3q;
import xsna.ydj;
import xsna.z3q;

@SuppressLint({"ThreadPoolCreation"})
/* loaded from: classes.dex */
public class ExecutorsRegistrar implements ComponentRegistrar {
    public static final cqy<ScheduledExecutorService> a = new cqy<>(new w3q());
    public static final cqy<ScheduledExecutorService> b = new cqy<>(new x3q());
    public static final cqy<ScheduledExecutorService> c = new cqy<>(new y3q());
    public static final cqy<ScheduledExecutorService> d = new cqy<>(new z3q());

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<i8i<?>> getComponents() {
        toe0 toe0Var = new toe0(wv5.class, ScheduledExecutorService.class);
        toe0[] toe0VarArr = {new toe0(wv5.class, ExecutorService.class), new toe0(wv5.class, Executor.class)};
        HashSet hashSet = new HashSet();
        HashSet hashSet2 = new HashSet();
        HashSet hashSet3 = new HashSet();
        hashSet.add(toe0Var);
        for (toe0 toe0Var2 : toe0VarArr) {
            upj.a(toe0Var2, "Null interface");
        }
        Collections.addAll(hashSet, toe0VarArr);
        i8i i8iVar = new i8i(null, new HashSet(hashSet), new HashSet(hashSet2), 0, 0, new a4q(0), hashSet3);
        toe0 toe0Var3 = new toe0(pf7.class, ScheduledExecutorService.class);
        toe0[] toe0VarArr2 = {new toe0(pf7.class, ExecutorService.class), new toe0(pf7.class, Executor.class)};
        HashSet hashSet4 = new HashSet();
        HashSet hashSet5 = new HashSet();
        HashSet hashSet6 = new HashSet();
        hashSet4.add(toe0Var3);
        for (toe0 toe0Var4 : toe0VarArr2) {
            upj.a(toe0Var4, "Null interface");
        }
        Collections.addAll(hashSet4, toe0VarArr2);
        i8i i8iVar2 = new i8i(null, new HashSet(hashSet4), new HashSet(hashSet5), 0, 0, new b4q(), hashSet6);
        toe0 toe0Var5 = new toe0(b6z.class, ScheduledExecutorService.class);
        toe0[] toe0VarArr3 = {new toe0(b6z.class, ExecutorService.class), new toe0(b6z.class, Executor.class)};
        HashSet hashSet7 = new HashSet();
        HashSet hashSet8 = new HashSet();
        HashSet hashSet9 = new HashSet();
        hashSet7.add(toe0Var5);
        for (toe0 toe0Var6 : toe0VarArr3) {
            upj.a(toe0Var6, "Null interface");
        }
        Collections.addAll(hashSet7, toe0VarArr3);
        i8i i8iVar3 = new i8i(null, new HashSet(hashSet7), new HashSet(hashSet8), 0, 0, new vu5(1), hashSet9);
        i8i.a b2 = i8i.b(new toe0(g0q0.class, Executor.class));
        b2.f = new ydj(1);
        return Arrays.asList(i8iVar, i8iVar2, i8iVar3, b2.b());
    }
}
