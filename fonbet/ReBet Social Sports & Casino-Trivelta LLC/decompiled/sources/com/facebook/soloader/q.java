package com.facebook.soloader;

import java.io.DataInputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.UShort;

/* loaded from: classes2.dex */
public class q {

    /* renamed from: a, reason: collision with root package name */
    public final String f31616a;

    /* renamed from: b, reason: collision with root package name */
    public final List f31617b;

    public q(String str, List list) {
        this.f31616a = str;
        this.f31617b = Collections.unmodifiableList(list);
    }

    public static q a(DataInputStream dataInputStream) {
        String c10 = c(dataInputStream);
        int readShort = dataInputStream.readShort() & UShort.MAX_VALUE;
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < readShort; i10++) {
            arrayList.add(d(dataInputStream));
        }
        return new q(c10, arrayList);
    }

    public static q b(InputStream inputStream) {
        return a(new DataInputStream(inputStream));
    }

    public static String c(DataInputStream dataInputStream) {
        byte readByte = dataInputStream.readByte();
        if (readByte == 1) {
            return "arm64-v8a";
        }
        if (readByte == 2) {
            return "armeabi-v7a";
        }
        if (readByte == 3) {
            return "x86_64";
        }
        if (readByte == 4) {
            return "x86";
        }
        throw new RuntimeException("Unrecognized arch id: " + ((int) readByte));
    }

    public static String d(DataInputStream dataInputStream) {
        byte[] bArr = new byte[dataInputStream.readShort() & UShort.MAX_VALUE];
        dataInputStream.readFully(bArr);
        return new String(bArr, StandardCharsets.UTF_8);
    }
}
