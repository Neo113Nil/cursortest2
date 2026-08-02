package com.vk.mediastore.media.exo.datasource;

import android.os.SystemClock;
import com.vk.mediastore.media.exo.datasource.VkHttpCallFactory;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.Executor;
import kotlin.Pair;
import xsna.fv00;
import xsna.jkv;
import xsna.py70;
import xsna.ttp0;

/* compiled from: VkHttpCallFactory.kt */
/* loaded from: classes3.dex */
public final class a implements py70 {
    public final long a = SystemClock.elapsedRealtime();

    @Override // xsna.py70
    public final long a() {
        return this.a;
    }

    @Override // xsna.py70
    public final void b(jkv jkvVar) {
        String str = jkvVar.z;
        HashMap<String, Pair<Integer, Integer>> hashMap = VkHttpCallFactory.h;
        Pair<Integer, Integer> pair = hashMap.get(str);
        if (pair == null) {
            return;
        }
        int intValue = pair.i().intValue();
        int intValue2 = pair.j().intValue();
        synchronized (VkHttpCallFactory.j) {
            ttp0.c(hashMap).remove(str);
            ttp0.a(VkHttpCallFactory.i).remove(str);
        }
        HashSet<Pair<VkHttpCallFactory.a, Executor>> hashSet = VkHttpCallFactory.k.get(Integer.valueOf(intValue));
        if (hashSet != null) {
            Iterator<T> it = hashSet.iterator();
            while (it.hasNext()) {
                Pair pair2 = (Pair) it.next();
                ((Executor) pair2.g()).execute(new fv00((VkHttpCallFactory.a) pair2.d(), jkvVar, intValue2, 1));
            }
        }
    }
}
