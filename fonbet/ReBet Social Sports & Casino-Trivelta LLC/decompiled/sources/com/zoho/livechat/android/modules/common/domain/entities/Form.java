package com.zoho.livechat.android.modules.common.domain.entities;

import Gb.c;
import Yd.a;
import android.content.Context;
import androidx.annotation.Keep;
import com.facebook.react.views.textinput.ReactTextInputShadowNode;
import com.google.gson.k;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.AbstractC3945n;
import com.zoho.livechat.android.utils.LiveChatUtil;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import od.t;
import og.AbstractC5895g;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u0000 *2\u00020\u0001:\u0004+,-.B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0013J\u0018\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u000fJR\u0010\u0017\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u000fJ\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001f\u001a\u00020\u001e2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001f\u0010 R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010!\u001a\u0004\b\"\u0010\u000fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010#\u001a\u0004\b$\u0010\u0011R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010%\u001a\u0004\b&\u0010\u0013R\u001f\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010\u0015R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010!\u001a\u0004\b)\u0010\u000f¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", "", "", "displayName", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;", "fieldsPrefillType", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;", "type", "", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "messages", "title", "<init>", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;", "component3", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;", "component4", "()Ljava/util/List;", "component5", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;Ljava/util/List;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;", "getFieldsPrefillType", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;", "getType", "Ljava/util/List;", "getMessages", "getTitle", "Companion", "a", "FieldsPrefillType", "Message", "Type", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Form {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @Nullable
    private final String displayName;

    @Nullable
    private final FieldsPrefillType fieldsPrefillType;

    @Nullable
    private final List<Message> messages;

    @Nullable
    private final String title;

    @Nullable
    private final Type type;

    @Keep
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005J\u0010\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J&\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\rJ\u0013\u0010\u000e\u001a\u00020\u00032\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\t\u0010\u0007¨\u0006\u0014"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;", "", "prefill", "", "showFields", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)V", "getPrefill", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getShowFields", "component1", "component2", "copy", "(Ljava/lang/Boolean;Ljava/lang/Boolean;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form$FieldsPrefillType;", "equals", "other", "hashCode", "", "toString", "", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class FieldsPrefillType {

        @c("prefill")
        @Nullable
        private final Boolean prefill;

        @c("show_fields")
        @Nullable
        private final Boolean showFields;

        public FieldsPrefillType(@Nullable Boolean bool, @Nullable Boolean bool2) {
            this.prefill = bool;
            this.showFields = bool2;
        }

        public static /* synthetic */ FieldsPrefillType copy$default(FieldsPrefillType fieldsPrefillType, Boolean bool, Boolean bool2, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                bool = fieldsPrefillType.prefill;
            }
            if ((i10 & 2) != 0) {
                bool2 = fieldsPrefillType.showFields;
            }
            return fieldsPrefillType.copy(bool, bool2);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Boolean getPrefill() {
            return this.prefill;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Boolean getShowFields() {
            return this.showFields;
        }

        @NotNull
        public final FieldsPrefillType copy(@Nullable Boolean prefill, @Nullable Boolean showFields) {
            return new FieldsPrefillType(prefill, showFields);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FieldsPrefillType)) {
                return false;
            }
            FieldsPrefillType fieldsPrefillType = (FieldsPrefillType) other;
            return Intrinsics.areEqual(this.prefill, fieldsPrefillType.prefill) && Intrinsics.areEqual(this.showFields, fieldsPrefillType.showFields);
        }

        @Nullable
        public final Boolean getPrefill() {
            return this.prefill;
        }

        @Nullable
        public final Boolean getShowFields() {
            return this.showFields;
        }

        public int hashCode() {
            Boolean bool = this.prefill;
            int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
            Boolean bool2 = this.showFields;
            return hashCode + (bool2 != null ? bool2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "FieldsPrefillType(prefill=" + this.prefill + ", showFields=" + this.showFields + ')';
        }
    }

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u0000 &2\u00020\u0001:\u0002'(B/\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000bJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u000bJ@\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u000bJ\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u000bR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\rR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001e\u0010\u000bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001f\u0010\u000bR$\u0010 \u001a\u0004\u0018\u00010\u00138\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006)"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "", "", "displayName", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;", "meta", "text", "messageTime", "<init>", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;", "component3", "component4", "copy", "(Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;", "getMeta", "getText", "getMessageTime", "stringResourceId", "Ljava/lang/Integer;", "getStringResourceId", "()Ljava/lang/Integer;", "setStringResourceId", "(Ljava/lang/Integer;)V", "Companion", "a", "Meta", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Message {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @c("dname")
        @Nullable
        private final String displayName;

        @c("mtime")
        @Nullable
        private final String messageTime;

        @c("meta")
        @Nullable
        private final Meta meta;

        @Nullable
        private Integer stringResourceId;

        @c("msg")
        @Nullable
        private final String text;

        @Keep
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\b\u0014\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001!B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u000e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n¢\u0006\u0002\u0010\u000bJ\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u0010\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u0011\u0010\u0019\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0003JP\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\nHÆ\u0001¢\u0006\u0002\u0010\u001bJ\u0013\u0010\u001c\u001a\u00020\b2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0007\u0010\u0011R\u001e\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;", "", "fieldName", "", "format", "inputCard", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;", "isSkippable", "", "suggestions", "", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;Ljava/lang/Boolean;Ljava/util/List;)V", "getFieldName", "()Ljava/lang/String;", "getFormat", "getInputCard", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSuggestions", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;Ljava/lang/Boolean;Ljava/util/List;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta;", "equals", "other", "hashCode", "", "toString", "InputCard", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Meta {

            @c("field_name")
            @Nullable
            private final String fieldName;

            @c("format")
            @Nullable
            private final String format;

            @c("input_card")
            @Nullable
            private final InputCard inputCard;

            @c("skippable")
            @Nullable
            private final Boolean isSkippable;

            @c("suggestions")
            @Nullable
            private final List<Object> suggestions;

            @Keep
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001(B?\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0012JR\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0012J\u0010\u0010\u0019\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u001a\u0010\u001d\u001a\u00020\u001c2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000eR\"\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\u0010R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b$\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010%\u001a\u0004\b&\u0010\u0014R\u001c\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b'\u0010\u0012¨\u0006)"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;", "", "", "maxLength", "", "options", "", ReactTextInputShadowNode.PROP_PLACEHOLDER, "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;", "type", "visibility", "<init>", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;Ljava/lang/String;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/String;", "component4", "()Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;", "component5", "copy", "(Ljava/lang/Integer;Ljava/util/List;Ljava/lang/String;Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getMaxLength", "Ljava/util/List;", "getOptions", "Ljava/lang/String;", "getPlaceholder", "Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Message$Meta$InputCard$a;", "getType", "getVisibility", "a", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class InputCard {

                @c("maxlength")
                @Nullable
                private final Integer maxLength;

                @c("options")
                @Nullable
                private final List<Object> options;

                @c(ReactTextInputShadowNode.PROP_PLACEHOLDER)
                @Nullable
                private final String placeholder;

                @c("type")
                @Nullable
                private final a type;

                @c("visibility")
                @Nullable
                private final String visibility;

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public static final class a {
                    private static final /* synthetic */ EnumEntries $ENTRIES;
                    private static final /* synthetic */ a[] $VALUES;

                    @NotNull
                    public static final C0613a Companion;

                    @c("visitor_name")
                    public static final a VisitorName = new a("VisitorName", 0);

                    @c("visitor_email")
                    public static final a VisitorEmail = new a("VisitorEmail", 1);

                    @c("visitor_phone")
                    public static final a VisitorPhone = new a("VisitorPhone", 2);

                    @c("campaign")
                    public static final a Campaign = new a("Campaign", 3);

                    @c("department")
                    public static final a Department = new a("Department", 4);

                    /* renamed from: com.zoho.livechat.android.modules.common.domain.entities.Form$Message$Meta$InputCard$a$a, reason: collision with other inner class name */
                    public static final class C0613a {

                        /* renamed from: com.zoho.livechat.android.modules.common.domain.entities.Form$Message$Meta$InputCard$a$a$a, reason: collision with other inner class name */
                        public /* synthetic */ class C0614a {
                            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                            static {
                                int[] iArr = new int[a.values().length];
                                try {
                                    iArr[a.VisitorName.ordinal()] = 1;
                                } catch (NoSuchFieldError unused) {
                                }
                                try {
                                    iArr[a.VisitorEmail.ordinal()] = 2;
                                } catch (NoSuchFieldError unused2) {
                                }
                                try {
                                    iArr[a.VisitorPhone.ordinal()] = 3;
                                } catch (NoSuchFieldError unused3) {
                                }
                                try {
                                    iArr[a.Campaign.ordinal()] = 4;
                                } catch (NoSuchFieldError unused4) {
                                }
                                try {
                                    iArr[a.Department.ordinal()] = 5;
                                } catch (NoSuchFieldError unused5) {
                                }
                                $EnumSwitchMapping$0 = iArr;
                            }
                        }

                        public /* synthetic */ C0613a(DefaultConstructorMarker defaultConstructorMarker) {
                            this();
                        }

                        public final String a(a aVar) {
                            Intrinsics.checkNotNullParameter(aVar, "<this>");
                            int i10 = C0614a.$EnumSwitchMapping$0[aVar.ordinal()];
                            if (i10 == 1) {
                                return "visitor_name";
                            }
                            if (i10 == 2) {
                                return "visitor_email";
                            }
                            if (i10 == 3) {
                                return "visitor_phone";
                            }
                            if (i10 == 4) {
                                return "campaign";
                            }
                            if (i10 == 5) {
                                return "department";
                            }
                            throw new NoWhenBranchMatchedException();
                        }

                        public C0613a() {
                        }
                    }

                    private static final /* synthetic */ a[] $values() {
                        return new a[]{VisitorName, VisitorEmail, VisitorPhone, Campaign, Department};
                    }

                    static {
                        a[] $values = $values();
                        $VALUES = $values;
                        $ENTRIES = EnumEntriesKt.enumEntries($values);
                        Companion = new C0613a(null);
                    }

                    private a(String str, int i10) {
                    }

                    @NotNull
                    public static EnumEntries<a> getEntries() {
                        return $ENTRIES;
                    }

                    public static a valueOf(String str) {
                        return (a) Enum.valueOf(a.class, str);
                    }

                    public static a[] values() {
                        return (a[]) $VALUES.clone();
                    }
                }

                public InputCard(@Nullable Integer num, @Nullable List<? extends Object> list, @Nullable String str, @Nullable a aVar, @Nullable String str2) {
                    this.maxLength = num;
                    this.options = list;
                    this.placeholder = str;
                    this.type = aVar;
                    this.visibility = str2;
                }

                public static /* synthetic */ InputCard copy$default(InputCard inputCard, Integer num, List list, String str, a aVar, String str2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        num = inputCard.maxLength;
                    }
                    if ((i10 & 2) != 0) {
                        list = inputCard.options;
                    }
                    if ((i10 & 4) != 0) {
                        str = inputCard.placeholder;
                    }
                    if ((i10 & 8) != 0) {
                        aVar = inputCard.type;
                    }
                    if ((i10 & 16) != 0) {
                        str2 = inputCard.visibility;
                    }
                    String str3 = str2;
                    String str4 = str;
                    return inputCard.copy(num, list, str4, aVar, str3);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final Integer getMaxLength() {
                    return this.maxLength;
                }

                @Nullable
                public final List<Object> component2() {
                    return this.options;
                }

                @Nullable
                /* renamed from: component3, reason: from getter */
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @Nullable
                /* renamed from: component4, reason: from getter */
                public final a getType() {
                    return this.type;
                }

                @Nullable
                /* renamed from: component5, reason: from getter */
                public final String getVisibility() {
                    return this.visibility;
                }

                @NotNull
                public final InputCard copy(@Nullable Integer maxLength, @Nullable List<? extends Object> options, @Nullable String placeholder, @Nullable a type, @Nullable String visibility) {
                    return new InputCard(maxLength, options, placeholder, type, visibility);
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof InputCard)) {
                        return false;
                    }
                    InputCard inputCard = (InputCard) other;
                    return Intrinsics.areEqual(this.maxLength, inputCard.maxLength) && Intrinsics.areEqual(this.options, inputCard.options) && Intrinsics.areEqual(this.placeholder, inputCard.placeholder) && this.type == inputCard.type && Intrinsics.areEqual(this.visibility, inputCard.visibility);
                }

                @Nullable
                public final Integer getMaxLength() {
                    return this.maxLength;
                }

                @Nullable
                public final List<Object> getOptions() {
                    return this.options;
                }

                @Nullable
                public final String getPlaceholder() {
                    return this.placeholder;
                }

                @Nullable
                public final a getType() {
                    return this.type;
                }

                @Nullable
                public final String getVisibility() {
                    return this.visibility;
                }

                public int hashCode() {
                    Integer num = this.maxLength;
                    int hashCode = (num == null ? 0 : num.hashCode()) * 31;
                    List<Object> list = this.options;
                    int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
                    String str = this.placeholder;
                    int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                    a aVar = this.type;
                    int hashCode4 = (hashCode3 + (aVar == null ? 0 : aVar.hashCode())) * 31;
                    String str2 = this.visibility;
                    return hashCode4 + (str2 != null ? str2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "InputCard(maxLength=" + this.maxLength + ", options=" + this.options + ", placeholder=" + this.placeholder + ", type=" + this.type + ", visibility=" + this.visibility + ')';
                }
            }

            public Meta(@Nullable String str, @Nullable String str2, @Nullable InputCard inputCard, @Nullable Boolean bool, @Nullable List<? extends Object> list) {
                this.fieldName = str;
                this.format = str2;
                this.inputCard = inputCard;
                this.isSkippable = bool;
                this.suggestions = list;
            }

            public static /* synthetic */ Meta copy$default(Meta meta, String str, String str2, InputCard inputCard, Boolean bool, List list, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = meta.fieldName;
                }
                if ((i10 & 2) != 0) {
                    str2 = meta.format;
                }
                if ((i10 & 4) != 0) {
                    inputCard = meta.inputCard;
                }
                if ((i10 & 8) != 0) {
                    bool = meta.isSkippable;
                }
                if ((i10 & 16) != 0) {
                    list = meta.suggestions;
                }
                List list2 = list;
                InputCard inputCard2 = inputCard;
                return meta.copy(str, str2, inputCard2, bool, list2);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getFieldName() {
                return this.fieldName;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getFormat() {
                return this.format;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final InputCard getInputCard() {
                return this.inputCard;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final Boolean getIsSkippable() {
                return this.isSkippable;
            }

            @Nullable
            public final List<Object> component5() {
                return this.suggestions;
            }

            @NotNull
            public final Meta copy(@Nullable String fieldName, @Nullable String format, @Nullable InputCard inputCard, @Nullable Boolean isSkippable, @Nullable List<? extends Object> suggestions) {
                return new Meta(fieldName, format, inputCard, isSkippable, suggestions);
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Meta)) {
                    return false;
                }
                Meta meta = (Meta) other;
                return Intrinsics.areEqual(this.fieldName, meta.fieldName) && Intrinsics.areEqual(this.format, meta.format) && Intrinsics.areEqual(this.inputCard, meta.inputCard) && Intrinsics.areEqual(this.isSkippable, meta.isSkippable) && Intrinsics.areEqual(this.suggestions, meta.suggestions);
            }

            @Nullable
            public final String getFieldName() {
                return this.fieldName;
            }

            @Nullable
            public final String getFormat() {
                return this.format;
            }

            @Nullable
            public final InputCard getInputCard() {
                return this.inputCard;
            }

            @Nullable
            public final List<Object> getSuggestions() {
                return this.suggestions;
            }

            public int hashCode() {
                String str = this.fieldName;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.format;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                InputCard inputCard = this.inputCard;
                int hashCode3 = (hashCode2 + (inputCard == null ? 0 : inputCard.hashCode())) * 31;
                Boolean bool = this.isSkippable;
                int hashCode4 = (hashCode3 + (bool == null ? 0 : bool.hashCode())) * 31;
                List<Object> list = this.suggestions;
                return hashCode4 + (list != null ? list.hashCode() : 0);
            }

            @Nullable
            public final Boolean isSkippable() {
                return this.isSkippable;
            }

            @NotNull
            public String toString() {
                return "Meta(fieldName=" + this.fieldName + ", format=" + this.format + ", inputCard=" + this.inputCard + ", isSkippable=" + this.isSkippable + ", suggestions=" + this.suggestions + ')';
            }
        }

        /* renamed from: com.zoho.livechat.android.modules.common.domain.entities.Form$Message$a, reason: from kotlin metadata */
        public static final class Companion {

            /* renamed from: com.zoho.livechat.android.modules.common.domain.entities.Form$Message$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C0615a {
                public static final /* synthetic */ int[] $EnumSwitchMapping$0;

                static {
                    int[] iArr = new int[Meta.InputCard.a.values().length];
                    try {
                        iArr[Meta.InputCard.a.VisitorName.ordinal()] = 1;
                    } catch (NoSuchFieldError unused) {
                    }
                    try {
                        iArr[Meta.InputCard.a.VisitorEmail.ordinal()] = 2;
                    } catch (NoSuchFieldError unused2) {
                    }
                    try {
                        iArr[Meta.InputCard.a.VisitorPhone.ordinal()] = 3;
                    } catch (NoSuchFieldError unused3) {
                    }
                    try {
                        iArr[Meta.InputCard.a.Campaign.ordinal()] = 4;
                    } catch (NoSuchFieldError unused4) {
                    }
                    try {
                        iArr[Meta.InputCard.a.Department.ordinal()] = 5;
                    } catch (NoSuchFieldError unused5) {
                    }
                    $EnumSwitchMapping$0 = iArr;
                }
            }

            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final Message.Meta a(Meta meta, Context context, String str) {
                Object m147constructorimpl;
                String str2;
                String str3;
                Intrinsics.checkNotNullParameter(meta, "<this>");
                Intrinsics.checkNotNullParameter(context, "context");
                Object obj = null;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    k kVar = new k();
                    kVar.n("skippable", meta.isSkippable());
                    kVar.n("form_msg", Boolean.TRUE);
                    String format = meta.getFormat();
                    if (format != null) {
                        kVar.p("format", format);
                    }
                    String fieldName = meta.getFieldName();
                    if (fieldName != null) {
                        kVar.p("field_name", fieldName);
                    }
                    if (meta.getInputCard() != null) {
                        Meta.InputCard.a type = meta.getInputCard().getType();
                        if (type == Meta.InputCard.a.Campaign) {
                            ArrayList arrayList = new ArrayList();
                            int i10 = t.f60978Z0;
                            arrayList.add(new Message.Meta.a(Integer.valueOf(i10), context.getString(i10)));
                            int i11 = t.f60972Y0;
                            arrayList.add(new Message.Meta.a(Integer.valueOf(i11), context.getString(i11)));
                            kVar.m("campaign_suggestions", a.j().B(arrayList));
                        } else {
                            if (type == Meta.InputCard.a.VisitorName) {
                                str2 = "name";
                                str3 = context.getString(t.f61076n1);
                                Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                            } else if (type == Meta.InputCard.a.VisitorEmail) {
                                str2 = "email";
                                str3 = context.getString(t.f61062l1);
                                Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                            } else if (type == Meta.InputCard.a.VisitorPhone) {
                                str2 = "phoneno";
                                str3 = context.getString(t.f61090p1);
                                Intrinsics.checkNotNullExpressionValue(str3, "getString(...)");
                            } else {
                                str2 = "";
                                str3 = "";
                            }
                            k kVar2 = new k();
                            kVar2.p("format", str2);
                            kVar2.p("error", str3);
                            k kVar3 = new k();
                            kVar3.m("validate", kVar2);
                            kVar.m("display_card", kVar3);
                        }
                    } else if (meta.getSuggestions() != null) {
                        kVar.m("suggestions", a.j().B(AbstractC3945n.i(false, null, str)));
                    }
                    obj = AbstractC5895g.a(a.j(), kVar, Message.Meta.class);
                    m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
                if (m150exceptionOrNullimpl != null) {
                    LiveChatUtil.log(m150exceptionOrNullimpl);
                }
                return (Message.Meta) obj;
            }

            public final boolean b(Message message, String str) {
                return message != null && message.getMeta() != null && Intrinsics.areEqual(message.getMeta().getFieldName(), "department") && AbstractC3945n.i(false, null, str).size() == 1;
            }

            public final Message c(Message message) {
                Intrinsics.checkNotNullParameter(message, "<this>");
                if (message.getMeta() != null) {
                    if (message.getMeta().getInputCard() != null) {
                        Meta.InputCard.a type = message.getMeta().getInputCard().getType();
                        int i10 = type == null ? -1 : C0615a.$EnumSwitchMapping$0[type.ordinal()];
                        if (i10 == -1) {
                            message.setStringResourceId(null);
                            return message;
                        }
                        if (i10 == 1) {
                            message.setStringResourceId(Integer.valueOf(t.f60999c1));
                            return message;
                        }
                        if (i10 == 2) {
                            message.setStringResourceId(Integer.valueOf(t.f60992b1));
                            return message;
                        }
                        if (i10 == 3) {
                            message.setStringResourceId(Integer.valueOf(t.f61006d1));
                            return message;
                        }
                        if (i10 == 4) {
                            message.setStringResourceId(Integer.valueOf(t.f60966X0));
                            return message;
                        }
                        if (i10 == 5) {
                            message.setStringResourceId(Integer.valueOf(t.f60985a1));
                            return message;
                        }
                    } else if (message.getMeta().getSuggestions() != null) {
                        message.setStringResourceId(Integer.valueOf(t.f60985a1));
                    }
                }
                return message;
            }

            public Companion() {
            }
        }

        public Message(@Nullable String str, @Nullable Meta meta, @Nullable String str2, @Nullable String str3) {
            this.displayName = str;
            this.meta = meta;
            this.text = str2;
            this.messageTime = str3;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, Meta meta, String str2, String str3, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = message.displayName;
            }
            if ((i10 & 2) != 0) {
                meta = message.meta;
            }
            if ((i10 & 4) != 0) {
                str2 = message.text;
            }
            if ((i10 & 8) != 0) {
                str3 = message.messageTime;
            }
            return message.copy(str, meta, str2, str3);
        }

        @JvmStatic
        @Nullable
        public static final Message.Meta getMessageMeta(@NotNull Meta meta, @NotNull Context context, @Nullable String str) {
            return INSTANCE.a(meta, context, str);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Meta getMeta() {
            return this.meta;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMessageTime() {
            return this.messageTime;
        }

        @NotNull
        public final Message copy(@Nullable String displayName, @Nullable Meta meta, @Nullable String text, @Nullable String messageTime) {
            return new Message(displayName, meta, text, messageTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return Intrinsics.areEqual(this.displayName, message.displayName) && Intrinsics.areEqual(this.meta, message.meta) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.messageTime, message.messageTime);
        }

        @Nullable
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        public final String getMessageTime() {
            return this.messageTime;
        }

        @Nullable
        public final Meta getMeta() {
            return this.meta;
        }

        @Nullable
        public final Integer getStringResourceId() {
            return this.stringResourceId;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.displayName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Meta meta = this.meta;
            int hashCode2 = (hashCode + (meta == null ? 0 : meta.hashCode())) * 31;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.messageTime;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        public final void setStringResourceId(@Nullable Integer num) {
            this.stringResourceId = num;
        }

        @NotNull
        public String toString() {
            return "Message(displayName=" + this.displayName + ", meta=" + this.meta + ", text=" + this.text + ", messageTime=" + this.messageTime + ')';
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/zoho/livechat/android/modules/common/domain/entities/Form$Type;", "", "(Ljava/lang/String;I)V", "Conversation", "Traditional", "Inline", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("conversation")
        public static final Type Conversation = new Type("Conversation", 0);

        @c("general")
        public static final Type Traditional = new Type("Traditional", 1);

        @c("classic")
        public static final Type Inline = new Type("Inline", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{Conversation, Traditional, Inline};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = EnumEntriesKt.enumEntries($values);
        }

        private Type(String str, int i10) {
        }

        @NotNull
        public static EnumEntries<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* renamed from: com.zoho.livechat.android.modules.common.domain.entities.Form$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final boolean a(Form form) {
            List<Message> messages;
            Message.Meta meta;
            if (form == null || (messages = form.getMessages()) == null || messages.size() != 1) {
                return false;
            }
            Message message = (Message) CollectionsKt.firstOrNull((List) form.getMessages());
            return Intrinsics.areEqual((message == null || (meta = message.getMeta()) == null) ? null : meta.getFieldName(), "department");
        }

        public final boolean b(Form form, String str) {
            return c(form, false, str);
        }

        public final boolean c(Form form, boolean z10, String str) {
            List i10;
            if (form != null && form.getMessages() != null && form.getMessages().size() == 1) {
                Message message = (Message) CollectionsKt.firstOrNull((List) form.getMessages());
                Message.Meta meta = message != null ? message.getMeta() : null;
                if (Intrinsics.areEqual(meta != null ? meta.getFieldName() : null, "department") && (i10 = AbstractC3945n.i(z10, null, str)) != null && i10.size() == 1) {
                    return true;
                }
            }
            return false;
        }

        public Companion() {
        }
    }

    public Form(@Nullable String str, @Nullable FieldsPrefillType fieldsPrefillType, @Nullable Type type, @Nullable List<Message> list, @Nullable String str2) {
        this.displayName = str;
        this.fieldsPrefillType = fieldsPrefillType;
        this.type = type;
        this.messages = list;
        this.title = str2;
    }

    public static /* synthetic */ Form copy$default(Form form, String str, FieldsPrefillType fieldsPrefillType, Type type, List list, String str2, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = form.displayName;
        }
        if ((i10 & 2) != 0) {
            fieldsPrefillType = form.fieldsPrefillType;
        }
        if ((i10 & 4) != 0) {
            type = form.type;
        }
        if ((i10 & 8) != 0) {
            list = form.messages;
        }
        if ((i10 & 16) != 0) {
            str2 = form.title;
        }
        String str3 = str2;
        Type type2 = type;
        return form.copy(str, fieldsPrefillType, type2, list, str3);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final FieldsPrefillType getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final List<Message> component4() {
        return this.messages;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Form copy(@Nullable String displayName, @Nullable FieldsPrefillType fieldsPrefillType, @Nullable Type type, @Nullable List<Message> messages, @Nullable String title) {
        return new Form(displayName, fieldsPrefillType, type, messages, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Form)) {
            return false;
        }
        Form form = (Form) other;
        return Intrinsics.areEqual(this.displayName, form.displayName) && Intrinsics.areEqual(this.fieldsPrefillType, form.fieldsPrefillType) && this.type == form.type && Intrinsics.areEqual(this.messages, form.messages) && Intrinsics.areEqual(this.title, form.title);
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final FieldsPrefillType getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    public final List<Message> getMessages() {
        return this.messages;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        FieldsPrefillType fieldsPrefillType = this.fieldsPrefillType;
        int hashCode2 = (hashCode + (fieldsPrefillType == null ? 0 : fieldsPrefillType.hashCode())) * 31;
        Type type = this.type;
        int hashCode3 = (hashCode2 + (type == null ? 0 : type.hashCode())) * 31;
        List<Message> list = this.messages;
        int hashCode4 = (hashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        String str2 = this.title;
        return hashCode4 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "Form(displayName=" + this.displayName + ", fieldsPrefillType=" + this.fieldsPrefillType + ", type=" + this.type + ", messages=" + this.messages + ", title=" + this.title + ')';
    }
}
