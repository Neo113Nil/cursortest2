package com.sofascore.model.firebase;

import com.ironsource.U3;
import com.sofascore.model.firebase.AdType;
import defpackage.aik;
import defpackage.d7f;
import defpackage.is8;
import defpackage.k13;
import defpackage.ltb;
import defpackage.sub;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0012\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u000fH\u0096\u0080\u0004J\u001a\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u0002H\u0096\u0080\u0004R\u0015\u0010\u0005\u001a\u00020\u0006X\u0096\u0084\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001a\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000b0\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/sofascore/model/firebase/AdTypeSerializer;", "Lkotlinx/serialization/KSerializer;", "Lcom/sofascore/model/firebase/AdType;", "<init>", "()V", "descriptor", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "stringToAdType", "", "", "adTypeToString", "deserialize", "decoder", "Lkotlinx/serialization/encoding/Decoder;", "serialize", "", "encoder", "Lkotlinx/serialization/encoding/Encoder;", U3.i.X, "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class AdTypeSerializer implements KSerializer {

    @NotNull
    private static final Map<AdType, String> adTypeToString;

    @NotNull
    private static final Map<String, AdType> stringToAdType;

    @NotNull
    public static final AdTypeSerializer INSTANCE = new AdTypeSerializer();

    @NotNull
    private static final SerialDescriptor descriptor = aik.g("AdType", d7f.n);

    static {
        ltb ltbVar = new ltb();
        for (AdType.Banner banner : AdType.Banner.getEntries()) {
            ltbVar.put("Banner." + banner.name(), banner);
        }
        for (AdType.Interstitial interstitial : AdType.Interstitial.getEntries()) {
            ltbVar.put("Interstitial." + interstitial.name(), interstitial);
        }
        for (AdType.RewardedInterstitial rewardedInterstitial : AdType.RewardedInterstitial.getEntries()) {
            ltbVar.put("RewardedInterstitial." + rewardedInterstitial.name(), rewardedInterstitial);
        }
        for (AdType.Preroll preroll : AdType.Preroll.getEntries()) {
            ltbVar.put("Preroll." + preroll.name(), preroll);
        }
        for (AdType.Native r2 : AdType.Native.getEntries()) {
            ltbVar.put("Native." + r2.name(), r2);
        }
        ltb d = ltbVar.d();
        stringToAdType = d;
        Set<Map.Entry> entrySet = d.entrySet();
        int c = sub.c(k13.r(entrySet, 10));
        if (c < 16) {
            c = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c);
        for (Map.Entry entry : entrySet) {
            linkedHashMap.put((AdType) entry.getValue(), (String) entry.getKey());
        }
        adTypeToString = linkedHashMap;
    }

    private AdTypeSerializer() {
    }

    @Override // defpackage.dy4
    @NotNull
    public AdType deserialize(@NotNull Decoder decoder) {
        decoder.getClass();
        AdType adType = stringToAdType.get(decoder.z());
        return adType == null ? AdType.Unknown.INSTANCE : adType;
    }

    @Override // defpackage.dy4
    @NotNull
    public SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(@NotNull Encoder encoder, @NotNull AdType value) {
        encoder.getClass();
        value.getClass();
        String str = adTypeToString.get(value);
        if (str != null) {
            encoder.F(str);
        } else {
            is8.c(value, "Unknown AdType: ");
        }
    }
}
