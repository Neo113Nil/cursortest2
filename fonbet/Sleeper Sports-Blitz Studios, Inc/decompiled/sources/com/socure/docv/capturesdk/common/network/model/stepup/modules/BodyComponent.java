package com.socure.docv.capturesdk.common.network.model.stepup.modules;

import com.facebook.appevents.iap.InAppPurchaseConstants;
import com.squareup.moshi.JsonClass;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ModuleResponse.kt */
@JsonClass(generateAdapter = true)
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u000b\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0007¨\u0006\u0012"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/BodyComponent;", "", "content", "", "type", "(Ljava/lang/String;Ljava/lang/String;)V", "getContent", "()Ljava/lang/String;", "getType", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", InAppPurchaseConstants.METHOD_TO_STRING, "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final /* data */ class BodyComponent {
    public static final int $stable = 0;
    private final String content;
    private final String type;

    public static /* synthetic */ BodyComponent copy$default(BodyComponent bodyComponent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bodyComponent.content;
        }
        if ((i & 2) != 0) {
            str2 = bodyComponent.type;
        }
        return bodyComponent.copy(str, str2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getContent() {
        return this.content;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    public final BodyComponent copy(String content, String type) {
        return new BodyComponent(content, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BodyComponent)) {
            return false;
        }
        BodyComponent bodyComponent = (BodyComponent) other;
        return Intrinsics.areEqual(this.content, bodyComponent.content) && Intrinsics.areEqual(this.type, bodyComponent.type);
    }

    public int hashCode() {
        String str = this.content;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "BodyComponent(content=" + this.content + ", type=" + this.type + ")";
    }

    public BodyComponent(String str, String str2) {
        this.content = str;
        this.type = str2;
    }

    public final String getContent() {
        return this.content;
    }

    public final String getType() {
        return this.type;
    }
}
