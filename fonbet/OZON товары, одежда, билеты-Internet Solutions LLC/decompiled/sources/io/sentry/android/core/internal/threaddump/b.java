package io.sentry.android.core.internal.threaddump;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList<? extends a> f67143a;

    /* renamed from: b, reason: collision with root package name */
    private final int f67144b;

    /* renamed from: c, reason: collision with root package name */
    public int f67145c;

    public b(@NotNull ArrayList<? extends a> arrayList) {
        this.f67143a = arrayList;
        this.f67144b = arrayList.size();
    }

    public static b c(@NotNull BufferedReader bufferedReader) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (true) {
            String readLine = bufferedReader.readLine();
            if (readLine == null) {
                return new b(arrayList);
            }
            a aVar = new a();
            aVar.f67142a = readLine;
            arrayList.add(aVar);
        }
    }

    public final boolean a() {
        return this.f67145c < this.f67144b;
    }

    public final a b() {
        int i11 = this.f67145c;
        if (i11 < 0 || i11 >= this.f67144b) {
            return null;
        }
        this.f67145c = i11 + 1;
        return this.f67143a.get(i11);
    }
}
