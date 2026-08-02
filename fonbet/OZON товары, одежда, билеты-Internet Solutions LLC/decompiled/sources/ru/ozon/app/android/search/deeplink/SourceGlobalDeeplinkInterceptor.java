package ru.ozon.app.android.search.deeplink;

import GZ.j;
import KZ.c;
import Sc.InterfaceC4008j;
import Sc.o;
import android.content.Context;
import android.net.Uri;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.LazyUtilsKt;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0007\u0018\u0000 \u001b2\u00020\u0001:\u0001\u001bB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001b\u0010\t\u001a\u00020\u0006*\u00020\u00062\u0006\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u001b\u0010\u000f\u001a\u00020\u000e2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0011\u001a\u00060\u000bj\u0002`\f2\n\u0010\r\u001a\u00060\u000bj\u0002`\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0013R!\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00150\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/search/deeplink/SourceGlobalDeeplinkInterceptor;", "LKZ/c;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/net/Uri;", "LGZ/c;", "sourceType", "appendSource", "(Landroid/net/Uri;LGZ/c;)Landroid/net/Uri;", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LGZ/j;)Z", "intercept", "(LGZ/j;)LGZ/j;", "Landroid/content/Context;", "", "", "deeplinksNeedSource$delegate", "LSc/j;", "getDeeplinksNeedSource", "()Ljava/util/Set;", "deeplinksNeedSource", "Companion", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SourceGlobalDeeplinkInterceptor implements c {

    @NotNull
    private final Context context;

    /* renamed from: deeplinksNeedSource$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j deeplinksNeedSource;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/search/deeplink/SourceGlobalDeeplinkInterceptor$Companion;", "", "<init>", "()V", "QUERY_PARAMETER_NAME", "", "INTERNAL_QUERY_NAME", "EXTERNAL_QUERY_NAME", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes13.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[GZ.c.values().length];
            try {
                iArr[GZ.c.INTERNAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[GZ.c.EXTERNAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public SourceGlobalDeeplinkInterceptor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.deeplinksNeedSource = LazyUtilsKt.unsafeLazy(new SourceGlobalDeeplinkInterceptor$deeplinksNeedSource$2(this));
    }

    private final Uri appendSource(Uri uri, GZ.c cVar) {
        String str;
        int i11 = WhenMappings.$EnumSwitchMapping$0[cVar.ordinal()];
        if (i11 == 1) {
            str = "internal";
        } else {
            if (i11 != 2) {
                throw new o();
            }
            str = "external";
        }
        Uri build = uri.buildUpon().appendQueryParameter("source", str).build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    private final Set<String> getDeeplinksNeedSource() {
        return (Set) this.deeplinksNeedSource.getValue();
    }

    @Override // KZ.c
    public boolean canIntercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return C7714v.A(getDeeplinksNeedSource(), route.b().getAuthority());
    }

    @Override // KZ.a
    @NotNull
    public j intercept(@NotNull j route) {
        Intrinsics.checkNotNullParameter(route, "route");
        return j.a(route, appendSource(route.b(), route.c()));
    }
}
