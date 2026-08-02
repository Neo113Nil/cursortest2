package c90;

import android.content.SharedPreferences;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.fintech.network.domain.ExternalNetworkSettings;

/* renamed from: c90.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5777e {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final SharedPreferences f56842a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final ExternalNetworkSettings f56843b;

    public C5777e(@NotNull SharedPreferences sharedPreferences, @NotNull ExternalNetworkSettings externalNetworkSettings) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        Intrinsics.checkNotNullParameter(externalNetworkSettings, "externalNetworkSettings");
        this.f56842a = sharedPreferences;
        this.f56843b = externalNetworkSettings;
    }

    public final String a() {
        String aBVariantsHeader = this.f56843b.getABVariantsHeader();
        return aBVariantsHeader == null ? this.f56842a.getString("fintech_ab_variants_header", null) : aBVariantsHeader;
    }

    public final void b() {
        Intrinsics.checkNotNullParameter("", CommentV3DTO.HEADER_FIELD_NAME);
        SharedPreferences.Editor edit = this.f56842a.edit();
        edit.putString("fintech_ab_variants_header", "");
        edit.commit();
    }
}
