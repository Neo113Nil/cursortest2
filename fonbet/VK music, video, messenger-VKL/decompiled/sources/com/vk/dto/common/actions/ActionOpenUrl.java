package com.vk.dto.common.actions;

import com.ironsource.D1;
import com.unity3d.ads.BuildConfig;
import com.vk.core.serialize.Serializer;
import java.util.Objects;
import org.json.JSONObject;
import xsna.asp;
import xsna.epx;
import xsna.yq;
import xsna.zcl;
import xsna.zrp;

/* compiled from: ActionOpenUrl.kt */
/* loaded from: classes18.dex */
public class ActionOpenUrl extends Action {
    public final String c;
    public final Target d;
    public static final a e = new a();
    public static final Serializer.c<ActionOpenUrl> CREATOR = new b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ActionOpenUrl.kt */
    public static final class Target {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Target[] $VALUES;
        public static final Target authorize;

        /* renamed from: default, reason: not valid java name */
        public static final Target f30default;
        public static final Target external;

        /* renamed from: internal, reason: collision with root package name */
        public static final Target f88internal;

        static {
            Target target = new Target(D1.e, 0);
            external = target;
            Target target2 = new Target("internal", 1);
            f88internal = target2;
            Target target3 = new Target("authorize", 2);
            authorize = target3;
            Target target4 = new Target(BuildConfig.FLAVOR, 3);
            f30default = target4;
            Target[] targetArr = {target, target2, target3, target4};
            $VALUES = targetArr;
            $ENTRIES = new asp(targetArr);
        }

        public Target() {
            throw null;
        }

        public static zrp<Target> h() {
            return $ENTRIES;
        }

        public static Target valueOf(String str) {
            return (Target) Enum.valueOf(Target.class, str);
        }

        public static Target[] values() {
            return (Target[]) $VALUES.clone();
        }
    }

    /* compiled from: ActionOpenUrl.kt */
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        public static ActionOpenUrl a(JSONObject jSONObject) {
            Target target;
            Target target2;
            Object[] objArr;
            String optString = jSONObject.optString("target");
            Target[] values = Target.values();
            int length = values.length;
            int i = 0;
            while (true) {
                target = null;
                objArr = 0;
                if (i >= length) {
                    target2 = null;
                    break;
                }
                target2 = values[i];
                if (epx.f(target2.name(), optString)) {
                    break;
                }
                i++;
            }
            String optString2 = jSONObject.optString("url");
            return target2 != null ? new ActionOpenUrl(optString2, target2) : new ActionOpenUrl(optString2, target, 2, objArr == true ? 1 : 0);
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<ActionOpenUrl> {
        @Override // com.vk.core.serialize.Serializer.c
        public final ActionOpenUrl a(Serializer serializer) {
            return new ActionOpenUrl(serializer.H(), Target.values()[serializer.u()]);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new ActionOpenUrl[i];
        }
    }

    public /* synthetic */ ActionOpenUrl(String str, Target target, int i, zcl zclVar) {
        this(str, (i & 2) != 0 ? Target.f30default : target);
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public void O7(Serializer serializer) {
        serializer.j0(this.c);
        serializer.S(this.d.ordinal());
    }

    public JSONObject e5() {
        JSONObject d = yq.d("type", "open_url");
        d.put("url", this.c);
        d.put("target", this.d.name());
        return d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ActionOpenUrl)) {
            return false;
        }
        ActionOpenUrl actionOpenUrl = (ActionOpenUrl) obj;
        return epx.f(this.c, actionOpenUrl.c) && this.d == actionOpenUrl.d;
    }

    public final String getUrl() {
        return this.c;
    }

    public final int hashCode() {
        return Objects.hash(this.c, this.d);
    }

    public ActionOpenUrl(String str, Target target) {
        this.c = str;
        this.d = target;
    }
}
