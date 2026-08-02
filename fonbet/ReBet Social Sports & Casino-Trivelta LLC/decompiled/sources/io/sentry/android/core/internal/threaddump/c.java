package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.util.ArrayList;

/* loaded from: classes3.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f51050a;

    /* renamed from: b, reason: collision with root package name */
    public final int f51051b = 0;

    /* renamed from: c, reason: collision with root package name */
    public final int f51052c;

    /* renamed from: d, reason: collision with root package name */
    public int f51053d;

    public c(ArrayList arrayList) {
        this.f51050a = arrayList;
        this.f51052c = arrayList.size();
    }

    public static c c(BufferedReader bufferedReader) {
        ArrayList arrayList = new ArrayList();
        int i10 = 0;
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new c(arrayList);
            }
            i10++;
            arrayList.add(new b(i10, readLine));
        }
    }

    public boolean a() {
        return this.f51053d < this.f51052c;
    }

    public b b() {
        int i10 = this.f51053d;
        if (i10 < this.f51051b || i10 >= this.f51052c) {
            return null;
        }
        ArrayList arrayList = this.f51050a;
        this.f51053d = i10 + 1;
        return (b) arrayList.get(i10);
    }

    public void d() {
        this.f51053d--;
    }
}
