package com.google.gson;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: d, reason: collision with root package name */
    public static final i f6209d = new i("", "", false);

    /* renamed from: a, reason: collision with root package name */
    public final String f6210a;

    /* renamed from: b, reason: collision with root package name */
    public final String f6211b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f6212c;

    static {
        new i("\n", "  ", true);
    }

    public i(String str, String str2, boolean z5) {
        if (!str.matches("[\r\n]*")) {
            throw new IllegalArgumentException("Only combinations of \\n and \\r are allowed in newline.");
        }
        if (!str2.matches("[ \t]*")) {
            throw new IllegalArgumentException("Only combinations of spaces and tabs are allowed in indent.");
        }
        this.f6210a = str;
        this.f6211b = str2;
        this.f6212c = z5;
    }
}
