package ru.ozon.app.android.pdp.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.data.HammersV3BodyDTO;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u001a1\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a1\u0010\u0007\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0007\u0010\u0006\u001aE\u0010\n\u001a\u00020\u0000*\u00020\u00002\b\u0010\u0002\u001a\u0004\u0018\u00010\u00012\b\u0010\u0003\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010\u0004\u001a\u00020\u00012\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\bH\u0002¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/uni/atoms/data/AtomActionDTO;", "", "link", AppMeasurementSdk.ConditionalUserProperty.VALUE, HammersV3BodyDTO.PLACEHOLDER, "withUrlEncodedParameter", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "withBase64Parameter", "Lkotlin/Function1;", "encoder", "withEncodedParameter", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "pdp_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class AtomActionExtKt {
    @NotNull
    public static final AtomActionDTO withBase64Parameter(@NotNull AtomActionDTO atomActionDTO, String str, String str2, @NotNull String placeholder) {
        Intrinsics.checkNotNullParameter(atomActionDTO, "<this>");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return withEncodedParameter(atomActionDTO, str, str2, placeholder, AtomActionExtKt$withBase64Parameter$1.INSTANCE);
    }

    public static /* synthetic */ AtomActionDTO withBase64Parameter$default(AtomActionDTO atomActionDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "{placeholder}";
        }
        return withBase64Parameter(atomActionDTO, str, str2, str3);
    }

    private static final AtomActionDTO withEncodedParameter(AtomActionDTO atomActionDTO, String str, String str2, String str3, Function1<? super String, String> function1) {
        return (str == null || h.K(str) || str2 == null || h.K(str2)) ? atomActionDTO : AtomActionDTO.copy$default(atomActionDTO, null, h.X(str, str3, function1.invoke(str2), false), null, null, null, 29, null);
    }

    @NotNull
    public static final AtomActionDTO withUrlEncodedParameter(@NotNull AtomActionDTO atomActionDTO, String str, String str2, @NotNull String placeholder) {
        Intrinsics.checkNotNullParameter(atomActionDTO, "<this>");
        Intrinsics.checkNotNullParameter(placeholder, "placeholder");
        return withEncodedParameter(atomActionDTO, str, str2, placeholder, AtomActionExtKt$withUrlEncodedParameter$1.INSTANCE);
    }

    public static /* synthetic */ AtomActionDTO withUrlEncodedParameter$default(AtomActionDTO atomActionDTO, String str, String str2, String str3, int i11, Object obj) {
        if ((i11 & 4) != 0) {
            str3 = "{placeholder}";
        }
        return withUrlEncodedParameter(atomActionDTO, str, str2, str3);
    }
}
