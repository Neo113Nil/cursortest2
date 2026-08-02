package com.zoho.livechat.android.modules.conversations.data.local.entities;

import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BS\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0001\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\u0002\u0010\fJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0003Jc\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000e¨\u0006$"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/local/entities/SalesIQConversationAttributes;", "", "name", "", "additionalInfo", "displayPicture", "encodedDisplayPicture", "departments", "", "Lcom/zoho/livechat/android/modules/core/domain/entities/Channel$Department;", "customSecretFields", "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Object;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;)V", "getAdditionalInfo", "()Ljava/lang/String;", "getCustomSecretFields", "()Ljava/util/Map;", "getDepartments", "()Ljava/util/List;", "getDisplayPicture", "()Ljava/lang/Object;", "getEncodedDisplayPicture", "getName", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class SalesIQConversationAttributes {

    @Nullable
    private final String additionalInfo;

    @Nullable
    private final Map<String, String> customSecretFields;

    @Nullable
    private final List<Channel.Department> departments;

    @Nullable
    private final Object displayPicture;

    @Nullable
    private final String encodedDisplayPicture;

    @Nullable
    private final String name;

    public SalesIQConversationAttributes(@Nullable String str, @Nullable String str2, @Nullable Object obj, @Nullable String str3, @Nullable List<Channel.Department> list, @Nullable Map<String, String> map) {
        this.name = str;
        this.additionalInfo = str2;
        this.displayPicture = obj;
        this.encodedDisplayPicture = str3;
        this.departments = list;
        this.customSecretFields = map;
    }

    public static /* synthetic */ SalesIQConversationAttributes copy$default(SalesIQConversationAttributes salesIQConversationAttributes, String str, String str2, Object obj, String str3, List list, Map map, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            str = salesIQConversationAttributes.name;
        }
        if ((i10 & 2) != 0) {
            str2 = salesIQConversationAttributes.additionalInfo;
        }
        if ((i10 & 4) != 0) {
            obj = salesIQConversationAttributes.displayPicture;
        }
        if ((i10 & 8) != 0) {
            str3 = salesIQConversationAttributes.encodedDisplayPicture;
        }
        if ((i10 & 16) != 0) {
            list = salesIQConversationAttributes.departments;
        }
        if ((i10 & 32) != 0) {
            map = salesIQConversationAttributes.customSecretFields;
        }
        List list2 = list;
        Map map2 = map;
        return salesIQConversationAttributes.copy(str, str2, obj, str3, list2, map2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Object getDisplayPicture() {
        return this.displayPicture;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getEncodedDisplayPicture() {
        return this.encodedDisplayPicture;
    }

    @Nullable
    public final List<Channel.Department> component5() {
        return this.departments;
    }

    @Nullable
    public final Map<String, String> component6() {
        return this.customSecretFields;
    }

    @NotNull
    public final SalesIQConversationAttributes copy(@Nullable String name, @Nullable String additionalInfo, @Nullable Object displayPicture, @Nullable String encodedDisplayPicture, @Nullable List<Channel.Department> departments, @Nullable Map<String, String> customSecretFields) {
        return new SalesIQConversationAttributes(name, additionalInfo, displayPicture, encodedDisplayPicture, departments, customSecretFields);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SalesIQConversationAttributes)) {
            return false;
        }
        SalesIQConversationAttributes salesIQConversationAttributes = (SalesIQConversationAttributes) other;
        return Intrinsics.areEqual(this.name, salesIQConversationAttributes.name) && Intrinsics.areEqual(this.additionalInfo, salesIQConversationAttributes.additionalInfo) && Intrinsics.areEqual(this.displayPicture, salesIQConversationAttributes.displayPicture) && Intrinsics.areEqual(this.encodedDisplayPicture, salesIQConversationAttributes.encodedDisplayPicture) && Intrinsics.areEqual(this.departments, salesIQConversationAttributes.departments) && Intrinsics.areEqual(this.customSecretFields, salesIQConversationAttributes.customSecretFields);
    }

    @Nullable
    public final String getAdditionalInfo() {
        return this.additionalInfo;
    }

    @Nullable
    public final Map<String, String> getCustomSecretFields() {
        return this.customSecretFields;
    }

    @Nullable
    public final List<Channel.Department> getDepartments() {
        return this.departments;
    }

    @Nullable
    public final Object getDisplayPicture() {
        return this.displayPicture;
    }

    @Nullable
    public final String getEncodedDisplayPicture() {
        return this.encodedDisplayPicture;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    public int hashCode() {
        String str = this.name;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.additionalInfo;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Object obj = this.displayPicture;
        int hashCode3 = (hashCode2 + (obj == null ? 0 : obj.hashCode())) * 31;
        String str3 = this.encodedDisplayPicture;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<Channel.Department> list = this.departments;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, String> map = this.customSecretFields;
        return hashCode5 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SalesIQConversationAttributes(name=" + this.name + ", additionalInfo=" + this.additionalInfo + ", displayPicture=" + this.displayPicture + ", encodedDisplayPicture=" + this.encodedDisplayPicture + ", departments=" + this.departments + ", customSecretFields=" + this.customSecretFields + ')';
    }
}
