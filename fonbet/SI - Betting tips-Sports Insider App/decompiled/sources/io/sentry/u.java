package io.sentry;

import java.io.File;
import java.io.FilenameFilter;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class u implements FilenameFilter {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f17146a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f17147b;

    public /* synthetic */ u(int i5, Object obj) {
        this.f17146a = i5;
        this.f17147b = obj;
    }

    @Override // java.io.FilenameFilter
    public final boolean accept(File file, String str) {
        switch (this.f17146a) {
            case 0:
                return ((w) this.f17147b).a(str);
            default:
                io.sentry.android.replay.j jVar = (io.sentry.android.replay.j) this.f17147b;
                Intrinsics.checkNotNull(str);
                if (kotlin.text.z.i(str, ".jpg", false)) {
                    File file2 = new File(file, str);
                    Intrinsics.checkNotNullParameter(file2, "<this>");
                    String missingDelimiterValue = file2.getName();
                    Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "getName(...)");
                    Intrinsics.checkNotNullParameter(missingDelimiterValue, "<this>");
                    Intrinsics.checkNotNullParameter(".", "delimiter");
                    Intrinsics.checkNotNullParameter(missingDelimiterValue, "missingDelimiterValue");
                    int I = StringsKt.I(missingDelimiterValue, ".", 0, 6);
                    if (I != -1) {
                        missingDelimiterValue = missingDelimiterValue.substring(0, I);
                        Intrinsics.checkNotNullExpressionValue(missingDelimiterValue, "substring(...)");
                    }
                    Long Y = StringsKt.Y(missingDelimiterValue);
                    if (Y != null) {
                        jVar.c(file2, Y.longValue(), null);
                    }
                }
                return false;
        }
    }
}
