package io.appmetrica.analytics.impl;

import android.content.res.Configuration;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class Ib {
    public static List a(Configuration configuration) {
        return AndroidUtils.isApiAchieved(24) ? Jb.a(configuration) : kotlin.collections.t.c(Ge.a(configuration.locale));
    }
}
