package com.vk.superapp.api.internal.oauthrequests;

import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import com.vk.push.core.network.http.BaseHttpHeadersHolder;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.regex.Pattern;
import kotlin.Pair;
import okhttp3.m;
import okhttp3.t;
import ru.ok.android.sdk.SharedKt;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.alv;
import xsna.aru0;
import xsna.asp;
import xsna.bgx0;
import xsna.dgn0;
import xsna.kpe0;
import xsna.l7r0;
import xsna.nx2;
import xsna.pn00;
import xsna.yfx0;
import xsna.zdq;
import xsna.zr;
import xsna.zrp;

/* compiled from: AuthGetEsiaSignature.kt */
/* loaded from: classes6.dex */
public final class AuthGetEsiaSignature extends nx2<aru0> {
    public final String b;
    public final LinkedHashMap c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: AuthGetEsiaSignature.kt */
    public static final class Mnemonic {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mnemonic[] $VALUES;
        public static final Mnemonic REGISTRATION;
        public static final Mnemonic VERIFICATION;

        static {
            Mnemonic mnemonic = new Mnemonic("VERIFICATION", 0);
            VERIFICATION = mnemonic;
            Mnemonic mnemonic2 = new Mnemonic("REGISTRATION", 1);
            REGISTRATION = mnemonic2;
            Mnemonic[] mnemonicArr = {mnemonic, mnemonic2};
            $VALUES = mnemonicArr;
            $ENTRIES = new asp(mnemonicArr);
        }

        public Mnemonic() {
            throw null;
        }

        public static Mnemonic valueOf(String str) {
            return (Mnemonic) Enum.valueOf(Mnemonic.class, str);
        }

        public static Mnemonic[] values() {
            return (Mnemonic[]) $VALUES.clone();
        }

        @Override // java.lang.Enum
        public final String toString() {
            return name().toLowerCase(Locale.ROOT);
        }
    }

    public AuthGetEsiaSignature(int i, String str, String str2, String str3, boolean z) {
        this.b = zr.a("https://", str, "/get_esia_signature");
        this.c = pn00.m(new Pair("client_id", String.valueOf(i)), new Pair(SharedKt.PARAM_CLIENT_SECRET, str2), new Pair("access_type", "user"), new Pair("mnemonic", (z ? Mnemonic.VERIFICATION : Mnemonic.REGISTRATION).toString()), new Pair("external_client_id", str3));
    }

    @Override // xsna.nx2
    public final aru0 f(l7r0 l7r0Var) {
        String a = kpe0.a(kpe0.a, this.c, l7r0Var.a.g, null, 0, null, null, PsExtractor.VIDEO_STREAM_MASK);
        long j = dgn0.a().i;
        int i = dgn0.a().j;
        t.a aVar = t.Companion;
        Pattern pattern = m.e;
        m a2 = m.a.a(BaseHttpHeadersHolder.CONTENT_TYPE_URLENCODED);
        aVar.getClass();
        alv alvVar = new alv(this.b, j, i, 0, t.a.a(a, a2), null, 40);
        yfx0 yfx0Var = (yfx0) zdq.a(l7r0Var, alvVar, new bgx0(l7r0Var, alvVar, ""), true);
        String str = (String) pn00.h("timestamp", yfx0Var.b);
        HashMap hashMap = yfx0Var.b;
        return new aru0(str, (String) pn00.h(CommonConstant.ReqAccessTokenParam.SCOPE_LABEL, hashMap), (String) pn00.h("state", hashMap), (String) pn00.h("secret", hashMap), (String) hashMap.getOrDefault(SignalingProtocol.KEY_PERMISSIONS, null));
    }
}
