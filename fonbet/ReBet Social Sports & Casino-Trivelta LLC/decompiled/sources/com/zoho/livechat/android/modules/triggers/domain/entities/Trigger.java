package com.zoho.livechat.android.modules.triggers.domain.entities;

import Gb.c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import com.zoho.salesiqembed.android.tracking.TrackingHelper;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001:\u00044567BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJd\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b \u0010\u0014J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0014R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0014R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010\u0017R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010.\u001a\u0004\b/\u0010\u0019R\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u00100\u001a\u0004\b1\u0010\u001bR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u00102\u001a\u0004\b3\u0010\u001d¨\u00068"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger;", "", "", "delay", "", "encryptedVisitorInfo", "matchedRuleId", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;", "params", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;", "type", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;", "visitorInfo", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$a;", "action", "<init>", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$a;)V", "component1", "()Ljava/lang/Integer;", "component2", "()Ljava/lang/String;", "component3", "component4", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;", "component5", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;", "component6", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;", "component7", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$a;", "copy", "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$a;)Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger;", "toString", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/Integer;", "getDelay", "Ljava/lang/String;", "getEncryptedVisitorInfo", "getMatchedRuleId", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;", "getParams", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;", "getType", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;", "getVisitorInfo", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$a;", "getAction", "a", "Params", "Type", "VisitorInfo", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class Trigger {

    @c("action")
    @Nullable
    private final a action;

    @c("delay")
    @Nullable
    private final Integer delay;

    @c("encrypted_visitor_info")
    @Nullable
    private final String encryptedVisitorInfo;

    @c("matched_rule_id")
    @Nullable
    private final String matchedRuleId;

    @c("params")
    @Nullable
    private final Params params;

    @c("type")
    @Nullable
    private final Type type;

    @c("visitorinfo")
    @Nullable
    private final VisitorInfo visitorInfo;

    @Keep
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002-.BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0011\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0007HÆ\u0003J\u0011\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Ji\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00072\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\t\u0010 \u001a\u00020!HÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020!HÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020!HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u001e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0013R\u0018\u0010\f\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0011R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0011¨\u0006/"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params;", "Landroid/os/Parcelable;", "attender", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Attender;", "department", "", "departments", "", "messageList", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message;", "typingDelay", EventKeys.VALUE_KEY, "senderName", "(Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Attender;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAttender", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Attender;", "getDepartment", "()Ljava/lang/String;", "getDepartments", "()Ljava/util/List;", "getMessageList", "getSenderName", "getTypingDelay", "getValue", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Attender", "Message", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Params implements Parcelable {

        @NotNull
        public static final Parcelable.Creator<Params> CREATOR = new a();

        @c("attender")
        @Nullable
        private final Attender attender;

        @c("department")
        @Nullable
        private final String department;

        @c("departments")
        @Nullable
        private final List<String> departments;

        @c(alternate = {"msg_list"}, value = "msglist")
        @Nullable
        private final List<Message> messageList;

        @c("sender_name")
        @Nullable
        private final String senderName;

        @c("typing_delay")
        @Nullable
        private final String typingDelay;

        @c(EventKeys.VALUE_KEY)
        @Nullable
        private final String value;

        @Keep
        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0017\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003JV\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u001aJ\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\u0013\u0010\u001d\u001a\u00020\b2\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020\u001cHÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u001cHÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0007\u0010\u0010R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006'"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Attender;", "Landroid/os/Parcelable;", "aboutMe", "", StackTraceHelper.ID_KEY, "attenderImageKey", "displayName", "isBot", "", "sender", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getAboutMe", "()Ljava/lang/String;", "getAttenderImageKey", "getDisplayName", "getId", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getSender", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Attender;", "describeContents", "", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Attender implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Attender> CREATOR = new a();

            @c("aboutme")
            @Nullable
            private final String aboutMe;

            @c("attender_imagefkey")
            @Nullable
            private final String attenderImageKey;

            @c("dname")
            @Nullable
            private final String displayName;

            @c("attender")
            @Nullable
            private final String id;

            @c("isBot")
            @Nullable
            private final Boolean isBot;

            @c("sender")
            @Nullable
            private final String sender;

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Attender createFromParcel(Parcel parcel) {
                    Boolean valueOf;
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    String readString = parcel.readString();
                    String readString2 = parcel.readString();
                    String readString3 = parcel.readString();
                    String readString4 = parcel.readString();
                    if (parcel.readInt() == 0) {
                        valueOf = null;
                    } else {
                        valueOf = Boolean.valueOf(parcel.readInt() != 0);
                    }
                    return new Attender(readString, readString2, readString3, readString4, valueOf, parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Attender[] newArray(int i10) {
                    return new Attender[i10];
                }
            }

            public Attender(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable Boolean bool, @Nullable String str5) {
                this.aboutMe = str;
                this.id = str2;
                this.attenderImageKey = str3;
                this.displayName = str4;
                this.isBot = bool;
                this.sender = str5;
            }

            public static /* synthetic */ Attender copy$default(Attender attender, String str, String str2, String str3, String str4, Boolean bool, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    str = attender.aboutMe;
                }
                if ((i10 & 2) != 0) {
                    str2 = attender.id;
                }
                if ((i10 & 4) != 0) {
                    str3 = attender.attenderImageKey;
                }
                if ((i10 & 8) != 0) {
                    str4 = attender.displayName;
                }
                if ((i10 & 16) != 0) {
                    bool = attender.isBot;
                }
                if ((i10 & 32) != 0) {
                    str5 = attender.sender;
                }
                Boolean bool2 = bool;
                String str6 = str5;
                return attender.copy(str, str2, str3, str4, bool2, str6);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final String getAboutMe() {
                return this.aboutMe;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getId() {
                return this.id;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getAttenderImageKey() {
                return this.attenderImageKey;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final Boolean getIsBot() {
                return this.isBot;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final String getSender() {
                return this.sender;
            }

            @NotNull
            public final Attender copy(@Nullable String aboutMe, @Nullable String id2, @Nullable String attenderImageKey, @Nullable String displayName, @Nullable Boolean isBot, @Nullable String sender) {
                return new Attender(aboutMe, id2, attenderImageKey, displayName, isBot, sender);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Attender)) {
                    return false;
                }
                Attender attender = (Attender) other;
                return Intrinsics.areEqual(this.aboutMe, attender.aboutMe) && Intrinsics.areEqual(this.id, attender.id) && Intrinsics.areEqual(this.attenderImageKey, attender.attenderImageKey) && Intrinsics.areEqual(this.displayName, attender.displayName) && Intrinsics.areEqual(this.isBot, attender.isBot) && Intrinsics.areEqual(this.sender, attender.sender);
            }

            @Nullable
            public final String getAboutMe() {
                return this.aboutMe;
            }

            @Nullable
            public final String getAttenderImageKey() {
                return this.attenderImageKey;
            }

            @Nullable
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            public final String getId() {
                return this.id;
            }

            @Nullable
            public final String getSender() {
                return this.sender;
            }

            public int hashCode() {
                String str = this.aboutMe;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.id;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.attenderImageKey;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.displayName;
                int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
                Boolean bool = this.isBot;
                int hashCode5 = (hashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
                String str5 = this.sender;
                return hashCode5 + (str5 != null ? str5.hashCode() : 0);
            }

            @Nullable
            public final Boolean isBot() {
                return this.isBot;
            }

            @NotNull
            public String toString() {
                return "Attender(aboutMe=" + this.aboutMe + ", id=" + this.id + ", attenderImageKey=" + this.attenderImageKey + ", displayName=" + this.displayName + ", isBot=" + this.isBot + ", sender=" + this.sender + ')';
            }

            /* JADX WARN: Multi-variable type inference failed */
            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                int i10;
                Intrinsics.checkNotNullParameter(parcel, "out");
                parcel.writeString(this.aboutMe);
                parcel.writeString(this.id);
                parcel.writeString(this.attenderImageKey);
                parcel.writeString(this.displayName);
                Boolean bool = this.isBot;
                if (bool == null) {
                    i10 = 0;
                } else {
                    parcel.writeInt(1);
                    i10 = bool.booleanValue();
                }
                parcel.writeInt(i10);
                parcel.writeString(this.sender);
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001a\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\fJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0002\u0010\u0011J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001e\u001a\u0004\u0018\u00010\u0005HÆ\u0003Jb\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010 J\t\u0010!\u001a\u00020\bHÖ\u0001J\u0013\u0010\"\u001a\u00020#2\b\u0010$\u001a\u0004\u0018\u00010%HÖ\u0003J\t\u0010&\u001a\u00020\bHÖ\u0001J\t\u0010'\u001a\u00020\u0005HÖ\u0001J\u0019\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\bHÖ\u0001R\u0018\u0010\u000b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0018\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u000eR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u000eR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u000e¨\u0006."}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message;", "Landroid/os/Parcelable;", "meta", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;", "text", "", "messageId", "messageType", "", "time", "senderId", "displayName", "(Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getDisplayName", "()Ljava/lang/String;", "getMessageId", "getMessageType", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getMeta", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;", "getSenderId", "getText", "getTime", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message;", "describeContents", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "Meta", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class Message implements Parcelable {

            @NotNull
            public static final Parcelable.Creator<Message> CREATOR = new a();

            @c("dname")
            @Nullable
            private final String displayName;

            @c("msgid")
            @Nullable
            private final String messageId;

            @c("mtype")
            @Nullable
            private final Integer messageType;

            @c("meta")
            @Nullable
            private final Meta meta;

            @c("sender")
            @Nullable
            private final String senderId;

            @c("msg")
            @Nullable
            private final String text;

            @c("time")
            @Nullable
            private final String time;

            @Keep
            @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u000201BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0002\u0010\rJ\u0010\u0010\u001b\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u000b\u0010\u001e\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u000fJ\u0010\u0010 \u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018J\u0010\u0010!\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018Jb\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010#J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\u0013\u0010%\u001a\u00020\u00032\b\u0010&\u001a\u0004\u0018\u00010'HÖ\u0003J\t\u0010(\u001a\u00020\u000bHÖ\u0001J\t\u0010)\u001a\u00020*HÖ\u0001J\u0019\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020.2\u0006\u0010/\u001a\u00020\u000bHÖ\u0001R\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u000e\u0010\u000fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0013\u0010\u000fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0010\u001a\u0004\b\u0016\u0010\u000fR\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018R\u001a\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u001a\u0010\u0018¨\u00062"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;", "Landroid/os/Parcelable;", "handOff", "", "handoffConfig", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$HandoffConfig;", "hideCustomMessage", "inputCard", "Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$InputCard;", "skippable", "typingDelay", "", "version", "(Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$HandoffConfig;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$InputCard;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getHandOff", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getHandoffConfig", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$HandoffConfig;", "getHideCustomMessage", "getInputCard", "()Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$InputCard;", "getSkippable", "getTypingDelay", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getVersion", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$HandoffConfig;Ljava/lang/Boolean;Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$InputCard;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/Integer;)Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta;", "describeContents", "equals", "other", "", "hashCode", "toString", "", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "HandoffConfig", "InputCard", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
            public static final /* data */ class Meta implements Parcelable {

                @NotNull
                public static final Parcelable.Creator<Meta> CREATOR = new a();

                @c("hand_off")
                @Nullable
                private final Boolean handOff;

                @c("handoff_config")
                @Nullable
                private final HandoffConfig handoffConfig;

                @c("hide_custom_message")
                @Nullable
                private final Boolean hideCustomMessage;

                @c("input_card")
                @Nullable
                private final InputCard inputCard;

                @c("skippable")
                @Nullable
                private final Boolean skippable;

                @c("typing_delay")
                @Nullable
                private final Integer typingDelay;

                @c("version")
                @Nullable
                private final Integer version;

                @Keep
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$HandoffConfig;", "Landroid/os/Parcelable;", "ack", "", "text", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAck", "()Ljava/lang/String;", "getText", "getType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class HandoffConfig implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<HandoffConfig> CREATOR = new a();

                    @c("ack")
                    @Nullable
                    private final String ack;

                    @c("text")
                    @Nullable
                    private final String text;

                    @c("type")
                    @Nullable
                    private final String type;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final HandoffConfig createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new HandoffConfig(parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final HandoffConfig[] newArray(int i10) {
                            return new HandoffConfig[i10];
                        }
                    }

                    public HandoffConfig(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                        this.ack = str;
                        this.text = str2;
                        this.type = str3;
                    }

                    public static /* synthetic */ HandoffConfig copy$default(HandoffConfig handoffConfig, String str, String str2, String str3, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = handoffConfig.ack;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = handoffConfig.text;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = handoffConfig.type;
                        }
                        return handoffConfig.copy(str, str2, str3);
                    }

                    @Nullable
                    /* renamed from: component1, reason: from getter */
                    public final String getAck() {
                        return this.ack;
                    }

                    @Nullable
                    /* renamed from: component2, reason: from getter */
                    public final String getText() {
                        return this.text;
                    }

                    @Nullable
                    /* renamed from: component3, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    @NotNull
                    public final HandoffConfig copy(@Nullable String ack, @Nullable String text, @Nullable String type) {
                        return new HandoffConfig(ack, text, type);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof HandoffConfig)) {
                            return false;
                        }
                        HandoffConfig handoffConfig = (HandoffConfig) other;
                        return Intrinsics.areEqual(this.ack, handoffConfig.ack) && Intrinsics.areEqual(this.text, handoffConfig.text) && Intrinsics.areEqual(this.type, handoffConfig.type);
                    }

                    @Nullable
                    public final String getAck() {
                        return this.ack;
                    }

                    @Nullable
                    public final String getText() {
                        return this.text;
                    }

                    @Nullable
                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        String str = this.ack;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.text;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.type;
                        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "HandoffConfig(ack=" + this.ack + ", text=" + this.text + ", type=" + this.type + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@NotNull Parcel parcel, int flags) {
                        Intrinsics.checkNotNullParameter(parcel, "out");
                        parcel.writeString(this.ack);
                        parcel.writeString(this.text);
                        parcel.writeString(this.type);
                    }
                }

                @Keep
                @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0006J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J-\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0014HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\u0019\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u0010HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\b¨\u0006\u001c"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Params$Message$Meta$InputCard;", "Landroid/os/Parcelable;", AnnotatedPrivateKey.LABEL, "", "radius", "type", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getLabel", "()Ljava/lang/String;", "getRadius", "getType", "component1", "component2", "component3", "copy", "describeContents", "", "equals", "", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final /* data */ class InputCard implements Parcelable {

                    @NotNull
                    public static final Parcelable.Creator<InputCard> CREATOR = new a();

                    @c(AnnotatedPrivateKey.LABEL)
                    @Nullable
                    private final String label;

                    @c("radius")
                    @Nullable
                    private final String radius;

                    @c("type")
                    @Nullable
                    private final String type;

                    public static final class a implements Parcelable.Creator {
                        @Override // android.os.Parcelable.Creator
                        /* renamed from: a, reason: merged with bridge method [inline-methods] */
                        public final InputCard createFromParcel(Parcel parcel) {
                            Intrinsics.checkNotNullParameter(parcel, "parcel");
                            return new InputCard(parcel.readString(), parcel.readString(), parcel.readString());
                        }

                        @Override // android.os.Parcelable.Creator
                        /* renamed from: b, reason: merged with bridge method [inline-methods] */
                        public final InputCard[] newArray(int i10) {
                            return new InputCard[i10];
                        }
                    }

                    public InputCard(@Nullable String str, @Nullable String str2, @Nullable String str3) {
                        this.label = str;
                        this.radius = str2;
                        this.type = str3;
                    }

                    public static /* synthetic */ InputCard copy$default(InputCard inputCard, String str, String str2, String str3, int i10, Object obj) {
                        if ((i10 & 1) != 0) {
                            str = inputCard.label;
                        }
                        if ((i10 & 2) != 0) {
                            str2 = inputCard.radius;
                        }
                        if ((i10 & 4) != 0) {
                            str3 = inputCard.type;
                        }
                        return inputCard.copy(str, str2, str3);
                    }

                    @Nullable
                    /* renamed from: component1, reason: from getter */
                    public final String getLabel() {
                        return this.label;
                    }

                    @Nullable
                    /* renamed from: component2, reason: from getter */
                    public final String getRadius() {
                        return this.radius;
                    }

                    @Nullable
                    /* renamed from: component3, reason: from getter */
                    public final String getType() {
                        return this.type;
                    }

                    @NotNull
                    public final InputCard copy(@Nullable String label, @Nullable String radius, @Nullable String type) {
                        return new InputCard(label, radius, type);
                    }

                    @Override // android.os.Parcelable
                    public int describeContents() {
                        return 0;
                    }

                    public boolean equals(@Nullable Object other) {
                        if (this == other) {
                            return true;
                        }
                        if (!(other instanceof InputCard)) {
                            return false;
                        }
                        InputCard inputCard = (InputCard) other;
                        return Intrinsics.areEqual(this.label, inputCard.label) && Intrinsics.areEqual(this.radius, inputCard.radius) && Intrinsics.areEqual(this.type, inputCard.type);
                    }

                    @Nullable
                    public final String getLabel() {
                        return this.label;
                    }

                    @Nullable
                    public final String getRadius() {
                        return this.radius;
                    }

                    @Nullable
                    public final String getType() {
                        return this.type;
                    }

                    public int hashCode() {
                        String str = this.label;
                        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                        String str2 = this.radius;
                        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                        String str3 = this.type;
                        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                    }

                    @NotNull
                    public String toString() {
                        return "InputCard(label=" + this.label + ", radius=" + this.radius + ", type=" + this.type + ')';
                    }

                    @Override // android.os.Parcelable
                    public void writeToParcel(@NotNull Parcel parcel, int flags) {
                        Intrinsics.checkNotNullParameter(parcel, "out");
                        parcel.writeString(this.label);
                        parcel.writeString(this.radius);
                        parcel.writeString(this.type);
                    }
                }

                public static final class a implements Parcelable.Creator {
                    @Override // android.os.Parcelable.Creator
                    /* renamed from: a, reason: merged with bridge method [inline-methods] */
                    public final Meta createFromParcel(Parcel parcel) {
                        Boolean valueOf;
                        Boolean valueOf2;
                        Boolean valueOf3;
                        Intrinsics.checkNotNullParameter(parcel, "parcel");
                        if (parcel.readInt() == 0) {
                            valueOf = null;
                        } else {
                            valueOf = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        HandoffConfig createFromParcel = parcel.readInt() == 0 ? null : HandoffConfig.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            valueOf2 = null;
                        } else {
                            valueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        InputCard createFromParcel2 = parcel.readInt() == 0 ? null : InputCard.CREATOR.createFromParcel(parcel);
                        if (parcel.readInt() == 0) {
                            valueOf3 = null;
                        } else {
                            valueOf3 = Boolean.valueOf(parcel.readInt() != 0);
                        }
                        return new Meta(valueOf, createFromParcel, valueOf2, createFromParcel2, valueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
                    }

                    @Override // android.os.Parcelable.Creator
                    /* renamed from: b, reason: merged with bridge method [inline-methods] */
                    public final Meta[] newArray(int i10) {
                        return new Meta[i10];
                    }
                }

                public Meta(@Nullable Boolean bool, @Nullable HandoffConfig handoffConfig, @Nullable Boolean bool2, @Nullable InputCard inputCard, @Nullable Boolean bool3, @Nullable Integer num, @Nullable Integer num2) {
                    this.handOff = bool;
                    this.handoffConfig = handoffConfig;
                    this.hideCustomMessage = bool2;
                    this.inputCard = inputCard;
                    this.skippable = bool3;
                    this.typingDelay = num;
                    this.version = num2;
                }

                public static /* synthetic */ Meta copy$default(Meta meta, Boolean bool, HandoffConfig handoffConfig, Boolean bool2, InputCard inputCard, Boolean bool3, Integer num, Integer num2, int i10, Object obj) {
                    if ((i10 & 1) != 0) {
                        bool = meta.handOff;
                    }
                    if ((i10 & 2) != 0) {
                        handoffConfig = meta.handoffConfig;
                    }
                    if ((i10 & 4) != 0) {
                        bool2 = meta.hideCustomMessage;
                    }
                    if ((i10 & 8) != 0) {
                        inputCard = meta.inputCard;
                    }
                    if ((i10 & 16) != 0) {
                        bool3 = meta.skippable;
                    }
                    if ((i10 & 32) != 0) {
                        num = meta.typingDelay;
                    }
                    if ((i10 & 64) != 0) {
                        num2 = meta.version;
                    }
                    Integer num3 = num;
                    Integer num4 = num2;
                    Boolean bool4 = bool3;
                    Boolean bool5 = bool2;
                    return meta.copy(bool, handoffConfig, bool5, inputCard, bool4, num3, num4);
                }

                @Nullable
                /* renamed from: component1, reason: from getter */
                public final Boolean getHandOff() {
                    return this.handOff;
                }

                @Nullable
                /* renamed from: component2, reason: from getter */
                public final HandoffConfig getHandoffConfig() {
                    return this.handoffConfig;
                }

                @Nullable
                /* renamed from: component3, reason: from getter */
                public final Boolean getHideCustomMessage() {
                    return this.hideCustomMessage;
                }

                @Nullable
                /* renamed from: component4, reason: from getter */
                public final InputCard getInputCard() {
                    return this.inputCard;
                }

                @Nullable
                /* renamed from: component5, reason: from getter */
                public final Boolean getSkippable() {
                    return this.skippable;
                }

                @Nullable
                /* renamed from: component6, reason: from getter */
                public final Integer getTypingDelay() {
                    return this.typingDelay;
                }

                @Nullable
                /* renamed from: component7, reason: from getter */
                public final Integer getVersion() {
                    return this.version;
                }

                @NotNull
                public final Meta copy(@Nullable Boolean handOff, @Nullable HandoffConfig handoffConfig, @Nullable Boolean hideCustomMessage, @Nullable InputCard inputCard, @Nullable Boolean skippable, @Nullable Integer typingDelay, @Nullable Integer version) {
                    return new Meta(handOff, handoffConfig, hideCustomMessage, inputCard, skippable, typingDelay, version);
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                public boolean equals(@Nullable Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof Meta)) {
                        return false;
                    }
                    Meta meta = (Meta) other;
                    return Intrinsics.areEqual(this.handOff, meta.handOff) && Intrinsics.areEqual(this.handoffConfig, meta.handoffConfig) && Intrinsics.areEqual(this.hideCustomMessage, meta.hideCustomMessage) && Intrinsics.areEqual(this.inputCard, meta.inputCard) && Intrinsics.areEqual(this.skippable, meta.skippable) && Intrinsics.areEqual(this.typingDelay, meta.typingDelay) && Intrinsics.areEqual(this.version, meta.version);
                }

                @Nullable
                public final Boolean getHandOff() {
                    return this.handOff;
                }

                @Nullable
                public final HandoffConfig getHandoffConfig() {
                    return this.handoffConfig;
                }

                @Nullable
                public final Boolean getHideCustomMessage() {
                    return this.hideCustomMessage;
                }

                @Nullable
                public final InputCard getInputCard() {
                    return this.inputCard;
                }

                @Nullable
                public final Boolean getSkippable() {
                    return this.skippable;
                }

                @Nullable
                public final Integer getTypingDelay() {
                    return this.typingDelay;
                }

                @Nullable
                public final Integer getVersion() {
                    return this.version;
                }

                public int hashCode() {
                    Boolean bool = this.handOff;
                    int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                    HandoffConfig handoffConfig = this.handoffConfig;
                    int hashCode2 = (hashCode + (handoffConfig == null ? 0 : handoffConfig.hashCode())) * 31;
                    Boolean bool2 = this.hideCustomMessage;
                    int hashCode3 = (hashCode2 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                    InputCard inputCard = this.inputCard;
                    int hashCode4 = (hashCode3 + (inputCard == null ? 0 : inputCard.hashCode())) * 31;
                    Boolean bool3 = this.skippable;
                    int hashCode5 = (hashCode4 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                    Integer num = this.typingDelay;
                    int hashCode6 = (hashCode5 + (num == null ? 0 : num.hashCode())) * 31;
                    Integer num2 = this.version;
                    return hashCode6 + (num2 != null ? num2.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "Meta(handOff=" + this.handOff + ", handoffConfig=" + this.handoffConfig + ", hideCustomMessage=" + this.hideCustomMessage + ", inputCard=" + this.inputCard + ", skippable=" + this.skippable + ", typingDelay=" + this.typingDelay + ", version=" + this.version + ')';
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@NotNull Parcel parcel, int flags) {
                    Intrinsics.checkNotNullParameter(parcel, "out");
                    Boolean bool = this.handOff;
                    if (bool == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(bool.booleanValue() ? 1 : 0);
                    }
                    HandoffConfig handoffConfig = this.handoffConfig;
                    if (handoffConfig == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        handoffConfig.writeToParcel(parcel, flags);
                    }
                    Boolean bool2 = this.hideCustomMessage;
                    if (bool2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(bool2.booleanValue() ? 1 : 0);
                    }
                    InputCard inputCard = this.inputCard;
                    if (inputCard == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        inputCard.writeToParcel(parcel, flags);
                    }
                    Boolean bool3 = this.skippable;
                    if (bool3 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(bool3.booleanValue() ? 1 : 0);
                    }
                    Integer num = this.typingDelay;
                    if (num == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(num.intValue());
                    }
                    Integer num2 = this.version;
                    if (num2 == null) {
                        parcel.writeInt(0);
                    } else {
                        parcel.writeInt(1);
                        parcel.writeInt(num2.intValue());
                    }
                }
            }

            public static final class a implements Parcelable.Creator {
                @Override // android.os.Parcelable.Creator
                /* renamed from: a, reason: merged with bridge method [inline-methods] */
                public final Message createFromParcel(Parcel parcel) {
                    Intrinsics.checkNotNullParameter(parcel, "parcel");
                    return new Message(parcel.readInt() == 0 ? null : Meta.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString(), parcel.readString());
                }

                @Override // android.os.Parcelable.Creator
                /* renamed from: b, reason: merged with bridge method [inline-methods] */
                public final Message[] newArray(int i10) {
                    return new Message[i10];
                }
            }

            public Message(@Nullable Meta meta, @Nullable String str, @Nullable String str2, @Nullable Integer num, @Nullable String str3, @Nullable String str4, @Nullable String str5) {
                this.meta = meta;
                this.text = str;
                this.messageId = str2;
                this.messageType = num;
                this.time = str3;
                this.senderId = str4;
                this.displayName = str5;
            }

            public static /* synthetic */ Message copy$default(Message message, Meta meta, String str, String str2, Integer num, String str3, String str4, String str5, int i10, Object obj) {
                if ((i10 & 1) != 0) {
                    meta = message.meta;
                }
                if ((i10 & 2) != 0) {
                    str = message.text;
                }
                if ((i10 & 4) != 0) {
                    str2 = message.messageId;
                }
                if ((i10 & 8) != 0) {
                    num = message.messageType;
                }
                if ((i10 & 16) != 0) {
                    str3 = message.time;
                }
                if ((i10 & 32) != 0) {
                    str4 = message.senderId;
                }
                if ((i10 & 64) != 0) {
                    str5 = message.displayName;
                }
                String str6 = str4;
                String str7 = str5;
                String str8 = str3;
                String str9 = str2;
                return message.copy(meta, str, str9, num, str8, str6, str7);
            }

            @Nullable
            /* renamed from: component1, reason: from getter */
            public final Meta getMeta() {
                return this.meta;
            }

            @Nullable
            /* renamed from: component2, reason: from getter */
            public final String getText() {
                return this.text;
            }

            @Nullable
            /* renamed from: component3, reason: from getter */
            public final String getMessageId() {
                return this.messageId;
            }

            @Nullable
            /* renamed from: component4, reason: from getter */
            public final Integer getMessageType() {
                return this.messageType;
            }

            @Nullable
            /* renamed from: component5, reason: from getter */
            public final String getTime() {
                return this.time;
            }

            @Nullable
            /* renamed from: component6, reason: from getter */
            public final String getSenderId() {
                return this.senderId;
            }

            @Nullable
            /* renamed from: component7, reason: from getter */
            public final String getDisplayName() {
                return this.displayName;
            }

            @NotNull
            public final Message copy(@Nullable Meta meta, @Nullable String text, @Nullable String messageId, @Nullable Integer messageType, @Nullable String time, @Nullable String senderId, @Nullable String displayName) {
                return new Message(meta, text, messageId, messageType, time, senderId, displayName);
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            public boolean equals(@Nullable Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Message)) {
                    return false;
                }
                Message message = (Message) other;
                return Intrinsics.areEqual(this.meta, message.meta) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.messageId, message.messageId) && Intrinsics.areEqual(this.messageType, message.messageType) && Intrinsics.areEqual(this.time, message.time) && Intrinsics.areEqual(this.senderId, message.senderId) && Intrinsics.areEqual(this.displayName, message.displayName);
            }

            @Nullable
            public final String getDisplayName() {
                return this.displayName;
            }

            @Nullable
            public final String getMessageId() {
                return this.messageId;
            }

            @Nullable
            public final Integer getMessageType() {
                return this.messageType;
            }

            @Nullable
            public final Meta getMeta() {
                return this.meta;
            }

            @Nullable
            public final String getSenderId() {
                return this.senderId;
            }

            @Nullable
            public final String getText() {
                return this.text;
            }

            @Nullable
            public final String getTime() {
                return this.time;
            }

            public int hashCode() {
                Meta meta = this.meta;
                int hashCode = (meta == null ? 0 : meta.hashCode()) * 31;
                String str = this.text;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.messageId;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                Integer num = this.messageType;
                int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
                String str3 = this.time;
                int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
                String str4 = this.senderId;
                int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.displayName;
                return hashCode6 + (str5 != null ? str5.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Message(meta=" + this.meta + ", text=" + this.text + ", messageId=" + this.messageId + ", messageType=" + this.messageType + ", time=" + this.time + ", senderId=" + this.senderId + ", displayName=" + this.displayName + ')';
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@NotNull Parcel parcel, int flags) {
                Intrinsics.checkNotNullParameter(parcel, "out");
                Meta meta = this.meta;
                if (meta == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    meta.writeToParcel(parcel, flags);
                }
                parcel.writeString(this.text);
                parcel.writeString(this.messageId);
                Integer num = this.messageType;
                if (num == null) {
                    parcel.writeInt(0);
                } else {
                    parcel.writeInt(1);
                    parcel.writeInt(num.intValue());
                }
                parcel.writeString(this.time);
                parcel.writeString(this.senderId);
                parcel.writeString(this.displayName);
            }
        }

        public static final class a implements Parcelable.Creator {
            @Override // android.os.Parcelable.Creator
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public final Params createFromParcel(Parcel parcel) {
                Intrinsics.checkNotNullParameter(parcel, "parcel");
                ArrayList arrayList = null;
                Attender createFromParcel = parcel.readInt() == 0 ? null : Attender.CREATOR.createFromParcel(parcel);
                String readString = parcel.readString();
                ArrayList<String> createStringArrayList = parcel.createStringArrayList();
                if (parcel.readInt() != 0) {
                    int readInt = parcel.readInt();
                    arrayList = new ArrayList(readInt);
                    for (int i10 = 0; i10 != readInt; i10++) {
                        arrayList.add(Message.CREATOR.createFromParcel(parcel));
                    }
                }
                return new Params(createFromParcel, readString, createStringArrayList, arrayList, parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Params[] newArray(int i10) {
                return new Params[i10];
            }
        }

        public Params(@Nullable Attender attender, @Nullable String str, @Nullable List<String> list, @Nullable List<Message> list2, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.attender = attender;
            this.department = str;
            this.departments = list;
            this.messageList = list2;
            this.typingDelay = str2;
            this.value = str3;
            this.senderName = str4;
        }

        public static /* synthetic */ Params copy$default(Params params, Attender attender, String str, List list, List list2, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                attender = params.attender;
            }
            if ((i10 & 2) != 0) {
                str = params.department;
            }
            if ((i10 & 4) != 0) {
                list = params.departments;
            }
            if ((i10 & 8) != 0) {
                list2 = params.messageList;
            }
            if ((i10 & 16) != 0) {
                str2 = params.typingDelay;
            }
            if ((i10 & 32) != 0) {
                str3 = params.value;
            }
            if ((i10 & 64) != 0) {
                str4 = params.senderName;
            }
            String str5 = str3;
            String str6 = str4;
            String str7 = str2;
            List list3 = list;
            return params.copy(attender, str, list3, list2, str7, str5, str6);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final Attender getAttender() {
            return this.attender;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getDepartment() {
            return this.department;
        }

        @Nullable
        public final List<String> component3() {
            return this.departments;
        }

        @Nullable
        public final List<Message> component4() {
            return this.messageList;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getTypingDelay() {
            return this.typingDelay;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getValue() {
            return this.value;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getSenderName() {
            return this.senderName;
        }

        @NotNull
        public final Params copy(@Nullable Attender attender, @Nullable String department, @Nullable List<String> departments, @Nullable List<Message> messageList, @Nullable String typingDelay, @Nullable String value, @Nullable String senderName) {
            return new Params(attender, department, departments, messageList, typingDelay, value, senderName);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Params)) {
                return false;
            }
            Params params = (Params) other;
            return Intrinsics.areEqual(this.attender, params.attender) && Intrinsics.areEqual(this.department, params.department) && Intrinsics.areEqual(this.departments, params.departments) && Intrinsics.areEqual(this.messageList, params.messageList) && Intrinsics.areEqual(this.typingDelay, params.typingDelay) && Intrinsics.areEqual(this.value, params.value) && Intrinsics.areEqual(this.senderName, params.senderName);
        }

        @Nullable
        public final Attender getAttender() {
            return this.attender;
        }

        @Nullable
        public final String getDepartment() {
            return this.department;
        }

        @Nullable
        public final List<String> getDepartments() {
            return this.departments;
        }

        @Nullable
        public final List<Message> getMessageList() {
            return this.messageList;
        }

        @Nullable
        public final String getSenderName() {
            return this.senderName;
        }

        @Nullable
        public final String getTypingDelay() {
            return this.typingDelay;
        }

        @Nullable
        public final String getValue() {
            return this.value;
        }

        public int hashCode() {
            Attender attender = this.attender;
            int hashCode = (attender == null ? 0 : attender.hashCode()) * 31;
            String str = this.department;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            List<String> list = this.departments;
            int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
            List<Message> list2 = this.messageList;
            int hashCode4 = (hashCode3 + (list2 == null ? 0 : list2.hashCode())) * 31;
            String str2 = this.typingDelay;
            int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.value;
            int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.senderName;
            return hashCode6 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Params(attender=" + this.attender + ", department=" + this.department + ", departments=" + this.departments + ", messageList=" + this.messageList + ", typingDelay=" + this.typingDelay + ", value=" + this.value + ", senderName=" + this.senderName + ')';
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@NotNull Parcel parcel, int flags) {
            Intrinsics.checkNotNullParameter(parcel, "out");
            Attender attender = this.attender;
            if (attender == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                attender.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.department);
            parcel.writeStringList(this.departments);
            List<Message> list = this.messageList;
            if (list == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                parcel.writeInt(list.size());
                Iterator<Message> it = list.iterator();
                while (it.hasNext()) {
                    it.next().writeToParcel(parcel, flags);
                }
            }
            parcel.writeString(this.typingDelay);
            parcel.writeString(this.value);
            parcel.writeString(this.senderName);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Keep
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$Type;", "", "(Ljava/lang/String;I)V", "SendChatInvite", "InvokeJSApi", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ EnumEntries $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;

        @c("send_chat_invite")
        public static final Type SendChatInvite = new Type("SendChatInvite", 0);

        @c(TrackingHelper.INVOKE_JS_API)
        public static final Type InvokeJSApi = new Type("InvokeJSApi", 1);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{SendChatInvite, InvokeJSApi};
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

    @Keep
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0018\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BK\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0003HÆ\u0003J]\u0010\u001a\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\fR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\fR\u0018\u0010\b\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\fR\u0018\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\f¨\u0006!"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/Trigger$VisitorInfo;", "", "browser", "", "ccode", "city", EventKeys.IP, "os", EventKeys.REGION, "state", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getBrowser", "()Ljava/lang/String;", "getCcode", "getCity", "getIp", "getOs", "getRegion", "getState", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class VisitorInfo {

        @c("browser")
        @Nullable
        private final String browser;

        @c("ccode")
        @Nullable
        private final String ccode;

        @c("city")
        @Nullable
        private final String city;

        @c(EventKeys.IP)
        @Nullable
        private final String ip;

        @c("os")
        @Nullable
        private final String os;

        @c(EventKeys.REGION)
        @Nullable
        private final String region;

        @c("state")
        @Nullable
        private final String state;

        public VisitorInfo(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6, @Nullable String str7) {
            this.browser = str;
            this.ccode = str2;
            this.city = str3;
            this.ip = str4;
            this.os = str5;
            this.region = str6;
            this.state = str7;
        }

        public static /* synthetic */ VisitorInfo copy$default(VisitorInfo visitorInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = visitorInfo.browser;
            }
            if ((i10 & 2) != 0) {
                str2 = visitorInfo.ccode;
            }
            if ((i10 & 4) != 0) {
                str3 = visitorInfo.city;
            }
            if ((i10 & 8) != 0) {
                str4 = visitorInfo.ip;
            }
            if ((i10 & 16) != 0) {
                str5 = visitorInfo.os;
            }
            if ((i10 & 32) != 0) {
                str6 = visitorInfo.region;
            }
            if ((i10 & 64) != 0) {
                str7 = visitorInfo.state;
            }
            String str8 = str6;
            String str9 = str7;
            String str10 = str5;
            String str11 = str3;
            return visitorInfo.copy(str, str2, str11, str4, str10, str8, str9);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getBrowser() {
            return this.browser;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final String getCcode() {
            return this.ccode;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getCity() {
            return this.city;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getIp() {
            return this.ip;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getOs() {
            return this.os;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final String getState() {
            return this.state;
        }

        @NotNull
        public final VisitorInfo copy(@Nullable String browser, @Nullable String ccode, @Nullable String city, @Nullable String ip, @Nullable String os, @Nullable String region, @Nullable String state) {
            return new VisitorInfo(browser, ccode, city, ip, os, region, state);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VisitorInfo)) {
                return false;
            }
            VisitorInfo visitorInfo = (VisitorInfo) other;
            return Intrinsics.areEqual(this.browser, visitorInfo.browser) && Intrinsics.areEqual(this.ccode, visitorInfo.ccode) && Intrinsics.areEqual(this.city, visitorInfo.city) && Intrinsics.areEqual(this.ip, visitorInfo.ip) && Intrinsics.areEqual(this.os, visitorInfo.os) && Intrinsics.areEqual(this.region, visitorInfo.region) && Intrinsics.areEqual(this.state, visitorInfo.state);
        }

        @Nullable
        public final String getBrowser() {
            return this.browser;
        }

        @Nullable
        public final String getCcode() {
            return this.ccode;
        }

        @Nullable
        public final String getCity() {
            return this.city;
        }

        @Nullable
        public final String getIp() {
            return this.ip;
        }

        @Nullable
        public final String getOs() {
            return this.os;
        }

        @Nullable
        public final String getRegion() {
            return this.region;
        }

        @Nullable
        public final String getState() {
            return this.state;
        }

        public int hashCode() {
            String str = this.browser;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.ccode;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.city;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.ip;
            int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
            String str5 = this.os;
            int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
            String str6 = this.region;
            int hashCode6 = (hashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
            String str7 = this.state;
            return hashCode6 + (str7 != null ? str7.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VisitorInfo(browser=" + this.browser + ", ccode=" + this.ccode + ", city=" + this.city + ", ip=" + this.ip + ", os=" + this.os + ", region=" + this.region + ", state=" + this.state + ')';
        }
    }

    public static final class a {
    }

    public Trigger(@Nullable Integer num, @Nullable String str, @Nullable String str2, @Nullable Params params, @Nullable Type type, @Nullable VisitorInfo visitorInfo, @Nullable a aVar) {
        this.delay = num;
        this.encryptedVisitorInfo = str;
        this.matchedRuleId = str2;
        this.params = params;
        this.type = type;
        this.visitorInfo = visitorInfo;
    }

    public static /* synthetic */ Trigger copy$default(Trigger trigger, Integer num, String str, String str2, Params params, Type type, VisitorInfo visitorInfo, a aVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            num = trigger.delay;
        }
        if ((i10 & 2) != 0) {
            str = trigger.encryptedVisitorInfo;
        }
        if ((i10 & 4) != 0) {
            str2 = trigger.matchedRuleId;
        }
        if ((i10 & 8) != 0) {
            params = trigger.params;
        }
        if ((i10 & 16) != 0) {
            type = trigger.type;
        }
        if ((i10 & 32) != 0) {
            visitorInfo = trigger.visitorInfo;
        }
        if ((i10 & 64) != 0) {
            trigger.getClass();
            aVar = null;
        }
        VisitorInfo visitorInfo2 = visitorInfo;
        a aVar2 = aVar;
        Type type2 = type;
        String str3 = str2;
        return trigger.copy(num, str, str3, params, type2, visitorInfo2, aVar2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Integer getDelay() {
        return this.delay;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getEncryptedVisitorInfo() {
        return this.encryptedVisitorInfo;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getMatchedRuleId() {
        return this.matchedRuleId;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Params getParams() {
        return this.params;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final VisitorInfo getVisitorInfo() {
        return this.visitorInfo;
    }

    @Nullable
    public final a component7() {
        return null;
    }

    @NotNull
    public final Trigger copy(@Nullable Integer delay, @Nullable String encryptedVisitorInfo, @Nullable String matchedRuleId, @Nullable Params params, @Nullable Type type, @Nullable VisitorInfo visitorInfo, @Nullable a action) {
        return new Trigger(delay, encryptedVisitorInfo, matchedRuleId, params, type, visitorInfo, action);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Trigger)) {
            return false;
        }
        Trigger trigger = (Trigger) other;
        return Intrinsics.areEqual(this.delay, trigger.delay) && Intrinsics.areEqual(this.encryptedVisitorInfo, trigger.encryptedVisitorInfo) && Intrinsics.areEqual(this.matchedRuleId, trigger.matchedRuleId) && Intrinsics.areEqual(this.params, trigger.params) && this.type == trigger.type && Intrinsics.areEqual(this.visitorInfo, trigger.visitorInfo) && Intrinsics.areEqual((Object) null, (Object) null);
    }

    @Nullable
    public final a getAction() {
        return null;
    }

    @Nullable
    public final Integer getDelay() {
        return this.delay;
    }

    @Nullable
    public final String getEncryptedVisitorInfo() {
        return this.encryptedVisitorInfo;
    }

    @Nullable
    public final String getMatchedRuleId() {
        return this.matchedRuleId;
    }

    @Nullable
    public final Params getParams() {
        return this.params;
    }

    @Nullable
    public final Type getType() {
        return this.type;
    }

    @Nullable
    public final VisitorInfo getVisitorInfo() {
        return this.visitorInfo;
    }

    public int hashCode() {
        Integer num = this.delay;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        String str = this.encryptedVisitorInfo;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.matchedRuleId;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Params params = this.params;
        int hashCode4 = (hashCode3 + (params == null ? 0 : params.hashCode())) * 31;
        Type type = this.type;
        int hashCode5 = (hashCode4 + (type == null ? 0 : type.hashCode())) * 31;
        VisitorInfo visitorInfo = this.visitorInfo;
        return (hashCode5 + (visitorInfo != null ? visitorInfo.hashCode() : 0)) * 31;
    }

    @NotNull
    public String toString() {
        return "Trigger(delay=" + this.delay + ", encryptedVisitorInfo=" + this.encryptedVisitorInfo + ", matchedRuleId=" + this.matchedRuleId + ", params=" + this.params + ", type=" + this.type + ", visitorInfo=" + this.visitorInfo + ", action=" + ((Object) null) + ')';
    }
}
