package h1;

import java.io.IOException;
import java.util.Map;

/* renamed from: h1.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4428x extends C4426v {

    /* renamed from: d, reason: collision with root package name */
    public final int f47621d;

    /* renamed from: e, reason: collision with root package name */
    public final String f47622e;

    /* renamed from: f, reason: collision with root package name */
    public final Map f47623f;
    public final byte[] responseBody;

    public C4428x(int i10, String str, IOException iOException, Map map, C4418n c4418n, byte[] bArr) {
        super("Response code: " + i10, iOException, c4418n, 2004, 1);
        this.f47621d = i10;
        this.f47622e = str;
        this.f47623f = map;
        this.responseBody = bArr;
    }
}
