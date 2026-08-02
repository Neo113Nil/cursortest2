package com.google.android.gms.internal.measurement;

import android.net.Uri;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class x3 {

    /* renamed from: a, reason: collision with root package name */
    public static final Uri f5350a = Uri.parse("content://com.google.android.gsf.gservices");

    /* renamed from: b, reason: collision with root package name */
    public static final Pattern f5351b;

    /* renamed from: c, reason: collision with root package name */
    public static final Pattern f5352c;

    static {
        Uri.parse("content://com.google.android.gsf.gservices/prefix");
        f5351b = Pattern.compile("^(1|true|t|on|yes|y)$", 2);
        f5352c = Pattern.compile("^(0|false|f|off|no|n)$", 2);
    }
}
