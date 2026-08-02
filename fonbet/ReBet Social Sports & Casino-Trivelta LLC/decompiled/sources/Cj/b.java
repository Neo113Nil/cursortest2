package Cj;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes5.dex */
public class b implements c {

    /* renamed from: c, reason: collision with root package name */
    public static final List f2322c = Collections.unmodifiableList(new ArrayList());

    /* renamed from: a, reason: collision with root package name */
    public String f2323a;

    /* renamed from: b, reason: collision with root package name */
    public List f2324b;
    private byte[] content;

    public b(String str, byte[] bArr) {
        this(str, f2322c, bArr);
    }

    public byte[] a() {
        return this.content;
    }

    public List b() {
        return this.f2324b;
    }

    public String c() {
        return this.f2323a;
    }

    public b(String str, List list, byte[] bArr) {
        this.f2323a = str;
        this.f2324b = Collections.unmodifiableList(list);
        this.content = bArr;
    }

    @Override // Cj.c
    public b generate() {
        return this;
    }
}
