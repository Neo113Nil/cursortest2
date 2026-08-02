package com.vk.superapp.api.states;

import com.ironsource.O6;
import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.auth.VkAuthCredentials;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import ru.ok.android.api.methods.authV2.login.LoginApiConstants;
import xsna.drm0;
import xsna.epx;
import xsna.jgp;
import xsna.par0;
import xsna.zcl;

/* compiled from: VkAuthState.kt */
/* loaded from: classes11.dex */
public final class VkAuthState extends Serializer.StreamParcelableAdapter {
    public static final Serializer.c<VkAuthState> CREATOR = new b();
    public String b;
    public String c;
    public LinkedHashMap d;
    public ArrayList e;

    /* compiled from: VkAuthState.kt */
    public static final class a {
        public static VkAuthState a(String str, String str2, String str3, String str4, String str5, String str6) {
            VkAuthState vkAuthState = new VkAuthState(null);
            vkAuthState.d.put("grant_type", "vk_external_auth");
            vkAuthState.d.put("vk_service", str);
            vkAuthState.d.put("vk_external_code", str2);
            vkAuthState.d.put("vk_external_client_id", str3);
            vkAuthState.d.put("vk_external_redirect_uri", str4);
            if (str5 != null) {
                vkAuthState.d.put("code_verifier", str5);
            }
            if (str6 != null) {
                vkAuthState.d.put("nonce", str6);
            }
            vkAuthState.d.put("2fa_supported", "1");
            return vkAuthState;
        }

        public static VkAuthState b(String str, String str2, String str3, boolean z) {
            VkAuthState vkAuthState = new VkAuthState(null);
            if (str3 != null) {
                vkAuthState.d.put(O6.e1, str3);
                if (z) {
                    vkAuthState.d.put("grant_type", "phone_confirmation_sid");
                } else {
                    vkAuthState.d.put("grant_type", LoginApiConstants.PARAM_NAME_PASSWORD);
                }
            } else {
                vkAuthState.d.put("grant_type", LoginApiConstants.PARAM_NAME_PASSWORD);
            }
            vkAuthState.d.put("username", str);
            vkAuthState.d.put(LoginApiConstants.PARAM_NAME_PASSWORD, str2);
            vkAuthState.d.put("2fa_supported", "1");
            vkAuthState.zb("supported_ways", "push");
            vkAuthState.zb("supported_ways", "email");
            return vkAuthState;
        }

        public static VkAuthState c(String str, String str2, boolean z, boolean z2) {
            VkAuthState vkAuthState = new VkAuthState(null);
            if (z) {
                vkAuthState.d.put("grant_type", "without_password");
                vkAuthState.d.put(LoginApiConstants.PARAM_NAME_PASSWORD, "");
            } else {
                vkAuthState.d.put("grant_type", "phone_confirmation_sid");
            }
            if (str != null) {
                vkAuthState.d.put(O6.e1, str);
            } else {
                par0.a.getClass();
                par0.e("Sid is null on Auth, but it shouldn't be empty");
            }
            vkAuthState.d.put("username", str2);
            if (z2) {
                vkAuthState.d.put("additional_sign_up_agreement_showed", "1");
            }
            vkAuthState.zb("supported_ways", "push");
            vkAuthState.zb("supported_ways", "email");
            return vkAuthState;
        }

        public static VkAuthState d(String str, String str2) {
            VkAuthState vkAuthState = new VkAuthState(null);
            vkAuthState.d.put("grant_type", "trusted_hash");
            vkAuthState.d.put(LoginApiConstants.PARAM_NAME_PASSWORD, "");
            vkAuthState.d.put("username", str2);
            if (str != null) {
                vkAuthState.d.put(O6.e1, str);
                return vkAuthState;
            }
            par0.a.getClass();
            par0.e("Sid is null on Auth, but it shouldn't be empty");
            return vkAuthState;
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<VkAuthState> {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.vk.core.serialize.Serializer.c
        public final VkAuthState a(Serializer serializer) {
            Map map;
            Object[] objArr = 0;
            VkAuthState vkAuthState = new VkAuthState(null);
            vkAuthState.b = serializer.H();
            vkAuthState.c = serializer.H();
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        String H = serializer.H();
                        String H2 = serializer.H();
                        if (H != null && H2 != null) {
                            map.put(H, H2);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                vkAuthState.d = new LinkedHashMap(map);
                vkAuthState.e = serializer.D();
                return vkAuthState;
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new VkAuthState[i];
        }
    }

    public /* synthetic */ VkAuthState(zcl zclVar) {
        this();
    }

    public final VkAuthCredentials Ab() {
        String str = (String) this.d.get("username");
        String str2 = (String) this.d.get(LoginApiConstants.PARAM_NAME_PASSWORD);
        if (str == null || str.length() == 0) {
            return null;
        }
        return new VkAuthCredentials(str, str2);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
        serializer.j0(this.c);
        LinkedHashMap linkedHashMap = this.d;
        if (linkedHashMap == null) {
            serializer.S(-1);
        } else {
            serializer.S(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                serializer.j0((String) entry.getKey());
                serializer.j0((String) entry.getValue());
            }
        }
        serializer.h0(this.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!VkAuthState.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        VkAuthState vkAuthState = (VkAuthState) obj;
        return epx.f(this.b, vkAuthState.b) && epx.f(this.c, vkAuthState.c) && epx.f(this.d, vkAuthState.d) && epx.f(this.e, vkAuthState.e);
    }

    public final int hashCode() {
        return Objects.hash(this.b, this.c, this.d, this.e);
    }

    public final void zb(String str, String str2) {
        String str3 = (String) this.d.get(str);
        if (str3 == null || !drm0.D(str3, str2, false)) {
            StringBuilder sb = new StringBuilder(str3 == null ? "" : str3);
            if (str3 != null && str3.length() != 0) {
                sb.append(StringUtils.COMMA);
            }
            sb.append(str2);
            this.d.put(str, sb.toString());
        }
    }

    public VkAuthState() {
        this.d = new LinkedHashMap();
        this.e = new ArrayList();
    }
}
