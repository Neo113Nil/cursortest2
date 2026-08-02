package com.appsflyer.share;

import com.ironsource.U3;
import defpackage.jp5;
import defpackage.kp5;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0006\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\tj\u0002\b\nj\u0002\b\u000b"}, d2 = {"Lcom/appsflyer/share/EmailsCryptType;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", U3.i.X, "I", "getValue", "()I", "NONE", "SHA256"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class EmailsCryptType {
    private static final /* synthetic */ jp5 AFKeystoreWrapper;
    public static final EmailsCryptType NONE;
    public static final EmailsCryptType SHA256;
    private static final /* synthetic */ EmailsCryptType[] d;
    private final int value;

    static {
        EmailsCryptType emailsCryptType = new EmailsCryptType("NONE", 0, 0);
        NONE = emailsCryptType;
        EmailsCryptType emailsCryptType2 = new EmailsCryptType("SHA256", 1, 3);
        SHA256 = emailsCryptType2;
        EmailsCryptType[] emailsCryptTypeArr = {emailsCryptType, emailsCryptType2};
        d = emailsCryptTypeArr;
        AFKeystoreWrapper = new kp5(emailsCryptTypeArr);
    }

    private EmailsCryptType(String str, int i, int i2) {
        this.value = i2;
    }

    @NotNull
    public static jp5 getEntries() {
        return AFKeystoreWrapper;
    }

    public static EmailsCryptType valueOf(String str) {
        return (EmailsCryptType) Enum.valueOf(EmailsCryptType.class, str);
    }

    public static EmailsCryptType[] values() {
        return (EmailsCryptType[]) d.clone();
    }

    public final int getValue() {
        return this.value;
    }
}
