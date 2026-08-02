package com.google.firebase.messaging;

import java.util.Locale;

/* loaded from: classes3.dex */
public final class a0 extends Exception {

    /* renamed from: a, reason: collision with root package name */
    public final int f37923a;

    public a0(String str) {
        super(str);
        this.f37923a = a(str);
    }

    public final int a(String str) {
        if (str == null) {
            return 0;
        }
        String lowerCase = str.toLowerCase(Locale.US);
        lowerCase.getClass();
        switch (lowerCase) {
        }
        return 0;
    }
}
