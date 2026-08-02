package com.appsflyer.internal;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0086\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\t\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\u0014\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0016J\u001a\u0010\u0004\u001a\u00020\u00032\b\u0010\u0002\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tH×\u0001¢\u0006\u0004\b\n\u0010\u000bR\u0011\u0010\r\u001a\u00020\fX\u0007¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0011\u0010\u0011\u001a\u00020\tX\u0007¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\tX\u0007¢\u0006\u0006\n\u0004\b\u0012\u0010\u0010"}, d2 = {"Lcom/appsflyer/internal/AFe1iSDK;", "", "p0", "", "equals", "(Ljava/lang/Object;)Z", "", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Lcom/appsflyer/internal/AFe1cSDK;", "AFInAppEventParameterName", "Lcom/appsflyer/internal/AFe1cSDK;", "valueOf", "Ljava/lang/String;", "values", "AFInAppEventType", "p1", "p2", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/appsflyer/internal/AFe1cSDK;)V"}, k = 1, mv = {1, 6, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class AFe1iSDK {

    @NotNull
    public final AFe1cSDK AFInAppEventParameterName;

    /* renamed from: AFInAppEventType, reason: from kotlin metadata */
    public final String valueOf;

    /* renamed from: valueOf, reason: from kotlin metadata */
    @NotNull
    public final String values;

    public AFe1iSDK(@NotNull String str, String str2, @NotNull AFe1cSDK aFe1cSDK) {
        Intrinsics.checkNotNullParameter(str, "");
        Intrinsics.checkNotNullParameter(aFe1cSDK, "");
        this.values = str;
        this.valueOf = str2;
        this.AFInAppEventParameterName = aFe1cSDK;
    }

    public final boolean equals(Object p02) {
        if (this == p02) {
            return true;
        }
        if (!(p02 instanceof AFe1iSDK)) {
            return false;
        }
        AFe1iSDK aFe1iSDK = (AFe1iSDK) p02;
        return Intrinsics.d(this.values, aFe1iSDK.values) && Intrinsics.d(this.valueOf, aFe1iSDK.valueOf) && this.AFInAppEventParameterName == aFe1iSDK.AFInAppEventParameterName;
    }

    public final int hashCode() {
        int hashCode = this.values.hashCode() * 31;
        String str = this.valueOf;
        return this.AFInAppEventParameterName.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AFe1iSDK(values=");
        sb2.append(this.values);
        sb2.append(", valueOf=");
        sb2.append(this.valueOf);
        sb2.append(", AFInAppEventParameterName=");
        sb2.append(this.AFInAppEventParameterName);
        sb2.append(')');
        return sb2.toString();
    }
}
