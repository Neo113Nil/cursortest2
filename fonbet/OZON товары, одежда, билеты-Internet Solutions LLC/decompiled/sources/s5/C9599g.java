package s5;

import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import v5.C10239m;

/* renamed from: s5.g, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9599g implements InterfaceC9596d<String, Uri> {
    @Override // s5.InterfaceC9596d
    public final Uri a(String str, C10239m c10239m) {
        Uri parse = Uri.parse(str);
        Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
        return parse;
    }
}
