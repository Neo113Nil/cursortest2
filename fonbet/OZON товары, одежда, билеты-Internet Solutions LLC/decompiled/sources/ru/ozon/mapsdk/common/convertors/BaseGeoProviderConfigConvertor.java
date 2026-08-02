package ru.ozon.mapsdk.common.convertors;

import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.i;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/mapsdk/common/convertors/BaseGeoProviderConfigConvertor;", "Lcom/google/gson/i;", "Lru/ozon/mapsdk/common/geoproxy/data/model/GeoProviderConfig;", "<init>", "()V", "mapsdk_fullFirebaseOpenglRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class BaseGeoProviderConfigConvertor implements i<GeoProviderConfig> {
    protected static String b(@NotNull JsonObject jsonObject, @NotNull String name) {
        Intrinsics.checkNotNullParameter(jsonObject, "<this>");
        Intrinsics.checkNotNullParameter(name, "name");
        JsonElement jsonElement = jsonObject.get(name);
        if (jsonElement != null) {
            if (jsonElement.isJsonNull()) {
                jsonElement = null;
            }
            if (jsonElement != null) {
                return jsonElement.getAsString();
            }
        }
        return null;
    }

    @NotNull
    protected abstract GeoProviderConfig.SdkType a(@NotNull JsonObject jsonObject);

    /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r3v0 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig, still in use, count: 2, list:
          (r3v0 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) from 0x00b2: MOVE (r24v1 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) = (r3v0 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig)
          (r3v0 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) from 0x00a1: MOVE (r24v3 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig) = (r3v0 ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:162)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:127)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:91)
        	at jadx.core.utils.InsnRemover.addAndUnbind(InsnRemover.java:57)
        	at jadx.core.dex.visitors.ModVisitor.removeStep(ModVisitor.java:447)
        	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
        */
    @Override // com.google.gson.i
    public final ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig deserialize(com.google.gson.JsonElement r24, java.lang.reflect.Type r25, com.google.gson.h r26) {
        /*
            r23 = this;
            if (r24 == 0) goto L8
            boolean r1 = r24.isJsonObject()
            if (r1 != 0) goto Lc
        L8:
            r25 = 0
            goto Ld7
        Lc:
            com.google.gson.JsonObject r1 = r24.getAsJsonObject()
            kotlin.jvm.internal.Intrinsics.f(r1)
            r2 = r23
            ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$SdkType r22 = r2.a(r1)
            ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig r3 = new ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig
            java.lang.String r4 = "logo"
            java.lang.String r4 = b(r1, r4)
            java.lang.String r5 = "logoMobile"
            java.lang.String r5 = b(r1, r5)
            java.lang.String r6 = "maxZoom"
            java.lang.String r6 = b(r1, r6)
            if (r6 == 0) goto L34
            java.lang.Double r6 = kotlin.text.h.u0(r6)
            goto L35
        L34:
            r6 = 0
        L35:
            java.lang.String r7 = "minZoom"
            java.lang.String r7 = b(r1, r7)
            if (r7 == 0) goto L42
            java.lang.Double r7 = kotlin.text.h.u0(r7)
            goto L43
        L42:
            r7 = 0
        L43:
            java.lang.String r8 = "name"
            java.lang.String r8 = b(r1, r8)
            java.lang.String r9 = "tileSize"
            java.lang.String r9 = b(r1, r9)
            if (r9 == 0) goto L56
            java.lang.Integer r9 = kotlin.text.h.w0(r9)
            goto L57
        L56:
            r9 = 0
        L57:
            java.lang.String r10 = "tileUrl"
            java.lang.String r10 = b(r1, r10)
            java.lang.String r11 = "key"
            java.lang.String r11 = b(r1, r11)
            java.lang.String r12 = "mode"
            java.lang.String r12 = b(r1, r12)
            java.lang.String r13 = "suggestPreferredProvider"
            java.lang.String r13 = b(r1, r13)
            java.lang.String r14 = "geocodePreferredProvider"
            java.lang.String r14 = b(r1, r14)
            java.lang.String r15 = "revGeocodePreferredProvider"
            java.lang.String r15 = b(r1, r15)
            r25 = 0
            java.lang.String r0 = "allowedLocations"
            java.lang.String r16 = b(r1, r0)
            java.lang.String r0 = "copyrights"
            java.lang.String r17 = b(r1, r0)
            java.lang.String r0 = "features"
            java.lang.String r18 = b(r1, r0)
            java.lang.String r0 = "suggest"
            com.google.gson.JsonElement r0 = r1.get(r0)
            if (r0 == 0) goto Lb2
            java.lang.String r0 = r0.getAsString()
            if (r0 == 0) goto Lb2
            java.util.Locale r2 = java.util.Locale.getDefault()
            r24 = r3
            java.lang.String r3 = "getDefault(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r2, r3)
            java.lang.String r0 = r0.toLowerCase(r2)
            java.lang.String r2 = "toLowerCase(...)"
            kotlin.jvm.internal.Intrinsics.checkNotNullExpressionValue(r0, r2)
            goto Lb6
        Lb2:
            r24 = r3
            r0 = r25
        Lb6:
            java.lang.String r2 = "backend"
            boolean r0 = kotlin.jvm.internal.Intrinsics.d(r0, r2)
            if (r0 == 0) goto Lc3
            ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig$ProviderSuggest r0 = ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig.ProviderSuggest.BACKEND
            r19 = r0
            goto Lc5
        Lc3:
            r19 = r25
        Lc5:
            java.lang.String r0 = "suggestProvider"
            java.lang.String r20 = b(r1, r0)
            java.lang.String r0 = "locale"
            java.lang.String r21 = b(r1, r0)
            r3 = r24
            r3.<init>(r4, r5, r6, r7, r8, r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22)
            return r3
        Ld7:
            return r25
        */
        throw new UnsupportedOperationException("Method not decompiled: ru.ozon.mapsdk.common.convertors.BaseGeoProviderConfigConvertor.deserialize(com.google.gson.JsonElement, java.lang.reflect.Type, com.google.gson.h):java.lang.Object");
    }
}
