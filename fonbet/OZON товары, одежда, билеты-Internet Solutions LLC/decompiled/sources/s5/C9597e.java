package s5;

import android.content.res.Resources;
import android.net.Uri;
import kotlin.jvm.internal.Intrinsics;
import v5.C10239m;

/* renamed from: s5.e, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9597e implements InterfaceC9596d<Integer, Uri> {
    @Override // s5.InterfaceC9596d
    public final Uri a(Integer num, C10239m c10239m) {
        int intValue = num.intValue();
        try {
            if (c10239m.f().getResources().getResourceEntryName(intValue) == null) {
                return null;
            }
            Uri parse = Uri.parse("android.resource://" + c10239m.f().getPackageName() + '/' + intValue);
            Intrinsics.checkNotNullExpressionValue(parse, "parse(this)");
            return parse;
        } catch (Resources.NotFoundException unused) {
            return null;
        }
    }
}
