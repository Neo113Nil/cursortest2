package com.playtika.pras.d;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* loaded from: classes8.dex */
public final class i {
    public String a;
    public final ExecutorService b = Executors.newSingleThreadExecutor();

    public i(String str) {
        this.a = str;
    }
}
