package com.zoho.livechat.android.modules.brand.data.local.entities;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\tJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003JO\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000bR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000b¨\u0006\u001e"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/local/entities/FormEntity;", "", "brandStatusType", "", "displayName", "fieldsPrefillType", "formType", "messages", "title", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrandStatusType", "()Ljava/lang/String;", "getDisplayName", "getFieldsPrefillType", "getFormType", "getMessages", "getTitle", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FormEntity {

    @NotNull
    private final String brandStatusType;

    @Nullable
    private final String displayName;

    @Nullable
    private final String fieldsPrefillType;

    @Nullable
    private final String formType;

    @Nullable
    private final String messages;

    @Nullable
    private final String title;

    public FormEntity(@NotNull String brandStatusType, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
        Intrinsics.checkNotNullParameter(brandStatusType, "brandStatusType");
        this.brandStatusType = brandStatusType;
        this.displayName = str;
        this.fieldsPrefillType = str2;
        this.formType = str3;
        this.messages = str4;
        this.title = str5;
    }

    public static /* synthetic */ FormEntity copy$default(FormEntity formEntity, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formEntity.brandStatusType;
        }
        if ((i10 & 2) != 0) {
            str2 = formEntity.displayName;
        }
        if ((i10 & 4) != 0) {
            str3 = formEntity.fieldsPrefillType;
        }
        if ((i10 & 8) != 0) {
            str4 = formEntity.formType;
        }
        if ((i10 & 16) != 0) {
            str5 = formEntity.messages;
        }
        if ((i10 & 32) != 0) {
            str6 = formEntity.title;
        }
        String str7 = str5;
        String str8 = str6;
        return formEntity.copy(str, str2, str3, str4, str7, str8);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getBrandStatusType() {
        return this.brandStatusType;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getMessages() {
        return this.messages;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final FormEntity copy(@NotNull String brandStatusType, @Nullable String displayName, @Nullable String fieldsPrefillType, @Nullable String formType, @Nullable String messages, @Nullable String title) {
        Intrinsics.checkNotNullParameter(brandStatusType, "brandStatusType");
        return new FormEntity(brandStatusType, displayName, fieldsPrefillType, formType, messages, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormEntity)) {
            return false;
        }
        FormEntity formEntity = (FormEntity) other;
        return Intrinsics.areEqual(this.brandStatusType, formEntity.brandStatusType) && Intrinsics.areEqual(this.displayName, formEntity.displayName) && Intrinsics.areEqual(this.fieldsPrefillType, formEntity.fieldsPrefillType) && Intrinsics.areEqual(this.formType, formEntity.formType) && Intrinsics.areEqual(this.messages, formEntity.messages) && Intrinsics.areEqual(this.title, formEntity.title);
    }

    @NotNull
    public final String getBrandStatusType() {
        return this.brandStatusType;
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final String getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    public final String getMessages() {
        return this.messages;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.brandStatusType.hashCode() * 31;
        String str = this.displayName;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.fieldsPrefillType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.formType;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.messages;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FormEntity(brandStatusType=" + this.brandStatusType + ", displayName=" + this.displayName + ", fieldsPrefillType=" + this.fieldsPrefillType + ", formType=" + this.formType + ", messages=" + this.messages + ", title=" + this.title + ')';
    }
}
