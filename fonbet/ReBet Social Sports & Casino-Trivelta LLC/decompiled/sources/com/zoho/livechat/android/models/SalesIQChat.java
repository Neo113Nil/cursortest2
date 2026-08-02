package com.zoho.livechat.android.models;

import android.annotation.SuppressLint;
import android.content.Context;
import android.database.Cursor;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.zoho.livechat.android.modules.messages.domain.entities.Message;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.MobilistenUtil;
import com.zoho.livechat.android.utils.Q;
import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import od.AbstractC5886l;
import od.t;
import og.AbstractC5892d;
import og.AbstractC5895g;
import rd.C6218a;

/* loaded from: classes4.dex */
public class SalesIQChat implements Serializable {
    private String attender;
    private String attenderEmail;
    private String attender_imgkey;
    private String attenderid;
    private long chatEndTime;
    private Long chatLastInitiatedTime;
    private String chid;
    private String convID;
    private String deptid;
    private String deptname;
    private String draft;
    private int endTime;
    private Extras extras;
    private String feedback;
    private boolean isCallEnabledForAttender;
    private boolean isTopSyncCompleted;
    private boolean isbotattender;
    private Message lastMessage;
    private long lastmsgtime;
    private Media media;
    private long missedTime;
    private String pkid;
    private String question;
    private long queueEndTime;
    private int queuePosition;
    private long queueStartTime;
    private int rating;
    private String rchatid;
    private boolean showQueue;
    private boolean show_continue_chat;
    private long startTime;
    private int status;
    private String statusKey;
    private long time;
    private List<MobilistenUtil.DateTime.TimeUnitResource> timeUnitResources;
    private b triggerData;
    private c type;
    private boolean unreadChat;
    private int unread_count;
    private String visitid;
    private String visitorid;
    private long waitingTimerStartTime;

    @Keep
    public static class Extras {

        @Gb.c("chat")
        public a attributes;

        @Gb.c("call")
        @Deprecated
        private b call;

        public static class a {

            @Gb.c("additional_info")
            public String additionalInfo;

            @Gb.c("display_picture")
            public String displayPicture;

            @Gb.c("name")
            public String name;

            @Gb.c("secret_info")
            public Map<String, String> secretInfo;

            public a() {
            }

            public a(String str, String str2, String str3, Map map) {
                this.name = str;
                this.additionalInfo = str2;
                this.displayPicture = str3;
                this.secretInfo = map;
            }
        }

        public static class b {
        }

        public Extras(a aVar) {
            this.attributes = aVar;
        }

        @Deprecated
        public b getCall() {
            return null;
        }
    }

    @Keep
    public static class Media {

        @Gb.c("connected_time")
        public Long connectedTime;

        @Gb.c(alternate = {"start_time"}, value = "created_time")
        public Long createdTime;

        @Gb.c("end_time")
        public Long endTime;

        @Gb.c("ended_by")
        public UserType endedBy;

        /* renamed from: id, reason: collision with root package name */
        @Gb.c(alternate = {"media_id"}, value = StackTraceHelper.ID_KEY)
        public String f42491id;

        @Gb.c("initiated_by")
        public UserType initiatedBy;

        @Gb.c("mode")
        public Mode mode;

        @Gb.c("pickup_time")
        public Long pickupTime;

        @Gb.c("recording_type")
        public String recordingType;

        @Gb.c(alternate = {"operation"}, value = "status")
        public Status status;

        @Gb.c("type")
        public String type;

        @Keep
        public enum Mode {
            DIRECT("direct"),
            QUEUE("queue");

            public final String value;

            Mode(String str) {
                this.value = str;
            }

            public static Mode from(String str) {
                str.getClass();
                if (str.equals("direct")) {
                    return DIRECT;
                }
                if (str.equals("queue")) {
                    return QUEUE;
                }
                return null;
            }
        }

        @Keep
        public enum Status {
            ENDED(ViewProps.END),
            REJECTED("reject"),
            MISSED("miss"),
            CANCELLED("cancel"),
            CONNECTED("connected"),
            INVITED("invite"),
            INITIATED("initiate"),
            ACCEPTED("accept");

            public final String value;

            Status(String str) {
                this.value = str;
            }

            public static Status from(String str) {
                str.getClass();
                switch (str) {
                    case "accept":
                        return ACCEPTED;
                    case "cancel":
                        return CANCELLED;
                    case "invite":
                        return INVITED;
                    case "reject":
                        return REJECTED;
                    case "connected":
                        return CONNECTED;
                    case "end":
                        return ENDED;
                    case "miss":
                        return MISSED;
                    case "initiate":
                        return INITIATED;
                    default:
                        return null;
                }
            }
        }

        @Keep
        public enum UserType {
            VISITOR("visitor"),
            OPERATOR("operator");

            public final String value;

            UserType(String str) {
                this.value = str;
            }

            public static UserType from(String str) {
                str.getClass();
                if (str.equals("operator")) {
                    return OPERATOR;
                }
                if (str.equals("visitor")) {
                    return VISITOR;
                }
                return null;
            }
        }

        public void setPickupTime(Long l10) {
            this.pickupTime = l10;
        }
    }

    public static /* synthetic */ class a {
        static final /* synthetic */ int[] $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status;

        static {
            int[] iArr = new int[Media.Status.values().length];
            $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status = iArr;
            try {
                iArr[Media.Status.ENDED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.REJECTED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.MISSED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.CANCELLED.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.CONNECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.INVITED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.INITIATED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                $SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[Media.Status.ACCEPTED.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
        }
    }

    public static class b {

        /* renamed from: a, reason: collision with root package name */
        public String f42492a;

        /* renamed from: b, reason: collision with root package name */
        public String f42493b;

        /* renamed from: c, reason: collision with root package name */
        public Long f42494c;

        /* renamed from: d, reason: collision with root package name */
        public String f42495d;

        /* renamed from: e, reason: collision with root package name */
        public String f42496e;

        /* renamed from: f, reason: collision with root package name */
        public Rf.a f42497f;

        public b(String str, String str2, Long l10, String str3, String str4, Rf.a aVar) {
            this.f42493b = str;
            this.f42492a = str2;
            this.f42494c = l10;
            this.f42495d = str3;
            this.f42496e = str4;
            this.f42497f = aVar;
        }

        public Rf.a a() {
            return this.f42497f;
        }

        public Long b() {
            return this.f42494c;
        }

        public String c() {
            return this.f42492a;
        }

        public String d() {
            return this.f42495d;
        }

        public String e() {
            return this.f42496e;
        }
    }

    public enum c {
        Chat("chat"),
        Call("call");

        public final String value;

        c(String str) {
            this.value = str;
        }

        public static c from(String str) {
            if (str == null) {
                return null;
            }
            if (str.equals("call")) {
                return Call;
            }
            if (str.equals("chat")) {
                return Chat;
            }
            return null;
        }
    }

    public SalesIQChat(String str, String str2, long j10, int i10, c cVar) {
        this.isTopSyncCompleted = false;
        this.lastmsgtime = 0L;
        this.unread_count = 0;
        this.startTime = 0L;
        this.endTime = 0;
        this.feedback = null;
        this.rating = 0;
        this.queuePosition = -1;
        this.showQueue = false;
        this.queueStartTime = 0L;
        this.queueEndTime = 0L;
        this.waitingTimerStartTime = 0L;
        this.unreadChat = false;
        this.chatLastInitiatedTime = null;
        this.isCallEnabledForAttender = false;
        this.timeUnitResources = getTimeUnitResources();
        this.chid = str;
        this.visitorid = str2;
        this.time = j10;
        this.status = i10;
        this.type = cVar;
    }

    private long getOrZero(Long l10) {
        if (l10 != null) {
            return l10.longValue();
        }
        return 0L;
    }

    private List<MobilistenUtil.DateTime.TimeUnitResource> getTimeUnitResources() {
        if (this.timeUnitResources == null) {
            ArrayList arrayList = new ArrayList(4);
            this.timeUnitResources = arrayList;
            arrayList.add(new MobilistenUtil.DateTime.TimeUnitResource(MobilistenUtil.DateTime.a.Day, t.f60933R3));
            this.timeUnitResources.add(new MobilistenUtil.DateTime.TimeUnitResource(MobilistenUtil.DateTime.a.Hour, t.f60939S3));
            this.timeUnitResources.add(new MobilistenUtil.DateTime.TimeUnitResource(MobilistenUtil.DateTime.a.Minute, t.f60945T3));
            this.timeUnitResources.add(new MobilistenUtil.DateTime.TimeUnitResource(MobilistenUtil.DateTime.a.Second, t.f60951U3));
        }
        return this.timeUnitResources;
    }

    private void handleOngoingCall(Context context, SpannableStringBuilder spannableStringBuilder) {
        Media media;
        String str;
        String str2;
        int i10 = this.status;
        if (i10 == 4 || i10 == 3) {
            if (i10 == 3) {
                spannableStringBuilder.append((CharSequence) context.getString(t.f60880I4));
                return;
            }
            return;
        }
        if ((Td.e.m0() && (((media = this.media) != null && (str2 = media.f42491id) != null && str2.equals(Td.e.L())) || ((str = this.visitorid) != null && str.equals(Td.e.K())))) || Q.f44447F.f44473h.contains(this.visitorid) || Q.f44447F.f44472g.contains(this.visitorid)) {
            spannableStringBuilder.append((CharSequence) context.getString(t.f60886J4));
        } else {
            spannableStringBuilder.append((CharSequence) context.getString(t.f60892K4));
        }
        spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC5892d.f(context, Integer.valueOf(AbstractC5886l.f59847k))), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.setSpan(new StyleSpan(1), 0, spannableStringBuilder.length(), 33);
    }

    public boolean canShowContinueChat() {
        return this.show_continue_chat;
    }

    public boolean canShowQueue() {
        return this.showQueue;
    }

    public boolean canShowQueueLayout() {
        if (!this.showQueue) {
            return false;
        }
        int i10 = this.status;
        if (i10 != 1 && i10 != 5) {
            if (i10 != 2) {
                return false;
            }
            String str = this.attenderEmail;
            if (str != null && !str.isEmpty()) {
                return false;
            }
        }
        return true;
    }

    public String getAttenderEmail() {
        return this.attenderEmail;
    }

    public String getAttenderImgkey() {
        return this.attender_imgkey;
    }

    public String getAttenderName() {
        return this.attender;
    }

    public String getAttenderid() {
        return this.attenderid;
    }

    public long getChatEndTime() {
        return this.chatEndTime;
    }

    public Long getChatLastInitiatedTime() {
        return this.chatLastInitiatedTime;
    }

    public String getChid() {
        return this.chid;
    }

    public String getConvID() {
        return this.convID;
    }

    public String getDepartmentName() {
        return this.deptname;
    }

    public String getDeptid() {
        return this.deptid;
    }

    public String getDraft() {
        return this.draft;
    }

    public Extras getExtras() {
        return this.extras;
    }

    public String getFeedback() {
        return this.feedback;
    }

    public Message getLastMessage() {
        return this.lastMessage;
    }

    public SpannableStringBuilder getLastMessageContentForCall(Context context) {
        Media.Status status;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        if (this.showQueue && this.queuePosition > 0) {
            if (com.zoho.livechat.android.modules.brand.ui.helpers.a.o(Md.a.Call)) {
                String string = context.getResources().getString(t.f60909N3, new DecimalFormat("00").format(this.queuePosition));
                spannableStringBuilder.append((CharSequence) (string + " | " + this.deptname));
                spannableStringBuilder.setSpan(new StyleSpan(1), 0, string.length(), 33);
            } else {
                spannableStringBuilder.append((CharSequence) context.getString(t.f60915O3));
            }
            spannableStringBuilder.setSpan(new ForegroundColorSpan(AbstractC5892d.f(context, Integer.valueOf(AbstractC5886l.f59732J2))), 0, spannableStringBuilder.length(), 33);
            return spannableStringBuilder;
        }
        Media media = this.media;
        if (media == null || (status = media.status) == null) {
            handleOngoingCall(context, spannableStringBuilder);
            return spannableStringBuilder;
        }
        switch (a.$SwitchMap$com$zoho$livechat$android$models$SalesIQChat$Media$Status[status.ordinal()]) {
            case 1:
                long orZero = getOrZero(this.media.connectedTime);
                long orZero2 = getOrZero(this.media.pickupTime);
                long orZero3 = getOrZero(this.media.createdTime);
                long orZero4 = getOrZero(this.media.endTime);
                long max = Math.max(orZero, orZero2);
                if (max != 0) {
                    orZero3 = max;
                }
                spannableStringBuilder.append((CharSequence) context.getString(t.f60832A4, MobilistenUtil.DateTime.a(context, orZero4 - orZero3, 2, true, this.timeUnitResources)));
                break;
            case 2:
            case 3:
                spannableStringBuilder.append((CharSequence) context.getString(t.f60880I4));
                break;
            case 4:
                spannableStringBuilder.append((CharSequence) context.getString(t.f61154z4));
                break;
            case 5:
            case 6:
            case 7:
            case 8:
                handleOngoingCall(context, spannableStringBuilder);
                break;
        }
        return spannableStringBuilder;
    }

    public long getLastmsgtime() {
        return this.lastmsgtime;
    }

    public Media getMedia() {
        return this.media;
    }

    public long getMissedTime() {
        return this.missedTime;
    }

    public String getPkid() {
        return this.pkid;
    }

    public String getQuestion() {
        return this.question;
    }

    public long getQueueEndTime() {
        return this.queueEndTime;
    }

    public int getQueuePosition() {
        return this.queuePosition;
    }

    public long getQueueStartTime() {
        return this.queueStartTime;
    }

    public int getRating() {
        return this.rating;
    }

    public String getRchatid() {
        return this.rchatid;
    }

    public int getRemainingTime() {
        return this.endTime - ((int) ((rd.b.f() - this.startTime) / 1000));
    }

    public int getStatus() {
        return this.status;
    }

    public String getStatusKey() {
        return this.statusKey;
    }

    public long getTime() {
        return this.time;
    }

    public int getTimerEndTime() {
        return this.endTime;
    }

    public long getTimerStartTime() {
        return this.startTime;
    }

    public b getTriggerData() {
        return this.triggerData;
    }

    public c getType() {
        return this.type;
    }

    public int getUnreadCount() {
        return this.unread_count;
    }

    public String getVisitid() {
        return this.visitid;
    }

    public String getVisitorid() {
        return this.visitorid;
    }

    public long getWaitingTimerStartTime() {
        return this.waitingTimerStartTime;
    }

    public boolean isBotAttender() {
        return this.isbotattender;
    }

    public boolean isCallEnabledForAttender() {
        return this.isCallEnabledForAttender;
    }

    public boolean isTopSyncCompleted() {
        return this.isTopSyncCompleted;
    }

    public boolean isTriggeredChat() {
        int i10 = this.status;
        return i10 == 5 || i10 == 6;
    }

    public boolean isUnreadChatAvailable() {
        return this.unreadChat;
    }

    public void setAttenderEmail(String str) {
        this.attenderEmail = str;
    }

    public void setAttenderImgkey(String str) {
        this.attender_imgkey = str;
    }

    public void setAttenderName(String str) {
        this.attender = str;
    }

    public void setAttenderid(String str) {
        this.attenderid = str;
    }

    public void setCallEnabledForAttender(boolean z10) {
        this.isCallEnabledForAttender = z10;
    }

    public void setChatEndTime(long j10) {
        this.chatEndTime = j10;
    }

    public void setChatLastInitiatedTime(Long l10) {
        this.chatLastInitiatedTime = l10;
    }

    public void setChid(String str) {
        this.chid = str;
    }

    public void setConvID(String str) {
        this.convID = str;
    }

    public void setDepartmentName(String str) {
        this.deptname = str;
    }

    public void setDeptid(String str) {
        this.deptid = str;
    }

    public void setDraft(String str) {
        this.draft = str;
    }

    public void setExtras(Extras extras) {
        this.extras = extras;
    }

    public void setFeedback(String str) {
        this.feedback = str;
    }

    public void setIsBotAttender(boolean z10) {
        this.isbotattender = z10;
    }

    public void setLastMessage(Message message) {
        this.lastMessage = message;
    }

    public void setLastmsgtime(long j10) {
        this.lastmsgtime = j10;
    }

    public void setMedia(Media media) {
        this.media = media;
    }

    public void setMissedTime(long j10) {
        this.missedTime = j10;
    }

    public void setQuestion(String str) {
        this.question = str;
    }

    public void setQueueData(Hashtable hashtable) {
        int intValue = LiveChatUtil.getInteger(hashtable.get("current_position")).intValue();
        if (intValue == 0) {
            intValue = -1;
        }
        long j10 = LiveChatUtil.getLong(hashtable.get("average_response_time"));
        if (intValue > 0) {
            showQueue(true);
            setQueueStartTime(rd.b.f());
            setQueuePosition(intValue);
            long j11 = j10 / 1000;
            if (j11 <= 0) {
                j11 = 60;
            }
            setQueueEndTime(j11);
        }
    }

    public void setQueueEndTime(long j10) {
        this.queueEndTime = j10;
    }

    public void setQueuePosition(int i10) {
        this.queuePosition = i10;
    }

    public void setQueueStartTime(long j10) {
        this.queueStartTime = j10;
    }

    public void setRating(int i10) {
        this.rating = i10;
    }

    public void setRchatid(String str) {
        this.rchatid = str;
    }

    public void setStatus(int i10) {
        this.status = i10;
    }

    public void setStatusKey(String str) {
        this.statusKey = str;
    }

    public void setTime(long j10) {
        this.time = j10;
    }

    public void setTimerEndTime(int i10) {
        this.endTime = i10;
    }

    public void setTimerStartTime(long j10) {
        this.startTime = j10;
    }

    public void setTopSyncCompleted(boolean z10) {
        this.isTopSyncCompleted = z10;
    }

    public void setTriggerData(b bVar) {
        this.triggerData = bVar;
    }

    public void setType(c cVar) {
        this.type = cVar;
    }

    public void setUnreadChat(boolean z10) {
        this.unreadChat = z10;
    }

    public void setUnreadCount(int i10) {
        String str = this.chid;
        if (str == null || str.equals(C6218a.y())) {
            return;
        }
        this.unread_count = i10;
    }

    public void setVisitid(String str) {
        this.visitid = str;
    }

    public void setVisitorid(String str) {
        this.visitorid = str;
    }

    public void setWaitingTimerStartTime(long j10) {
        this.waitingTimerStartTime = j10;
    }

    public void showContinueChat(boolean z10) {
        this.show_continue_chat = z10;
    }

    public void showQueue(boolean z10) {
        this.showQueue = z10;
    }

    public SalesIQChat(String str, String str2, String str3, long j10, int i10, c cVar) {
        this.isTopSyncCompleted = false;
        this.lastmsgtime = 0L;
        this.unread_count = 0;
        this.startTime = 0L;
        this.endTime = 0;
        this.feedback = null;
        this.rating = 0;
        this.queuePosition = -1;
        this.showQueue = false;
        this.queueStartTime = 0L;
        this.queueEndTime = 0L;
        this.waitingTimerStartTime = 0L;
        this.unreadChat = false;
        this.chatLastInitiatedTime = null;
        this.isCallEnabledForAttender = false;
        this.timeUnitResources = getTimeUnitResources();
        this.convID = str;
        this.chid = str2;
        this.visitorid = str3;
        this.time = j10;
        this.status = i10;
        this.type = cVar;
    }

    @SuppressLint({"Range"})
    public SalesIQChat(Cursor cursor) {
        this.isTopSyncCompleted = false;
        this.lastmsgtime = 0L;
        this.unread_count = 0;
        this.startTime = 0L;
        this.endTime = 0;
        this.feedback = null;
        this.rating = 0;
        this.queuePosition = -1;
        this.showQueue = false;
        this.queueStartTime = 0L;
        this.queueEndTime = 0L;
        this.waitingTimerStartTime = 0L;
        this.unreadChat = false;
        this.chatLastInitiatedTime = null;
        this.isCallEnabledForAttender = false;
        this.timeUnitResources = getTimeUnitResources();
        try {
            this.convID = cursor.getString(cursor.getColumnIndex("CONVID"));
            this.pkid = cursor.getString(cursor.getColumnIndex("_id"));
            this.chid = cursor.getString(cursor.getColumnIndex("CHATID"));
            this.visitorid = cursor.getString(cursor.getColumnIndex("VISITORID"));
            this.time = cursor.getLong(cursor.getColumnIndex("TIME"));
            this.attender = cursor.getString(cursor.getColumnIndex("ATTENDER"));
            this.question = cursor.getString(cursor.getColumnIndex("QUESTION"));
            this.attender_imgkey = cursor.getString(cursor.getColumnIndex("ATTENDER_IMGKEY"));
            this.lastMessage = (Message) AbstractC5895g.b(Yd.a.j(), cursor.getString(cursor.getColumnIndex("LASTMSG")), Message.class);
            this.isbotattender = cursor.getInt(cursor.getColumnIndex("ISBOTATTENDER")) == 1;
            this.visitid = cursor.getString(cursor.getColumnIndex("VISITID"));
            this.deptid = cursor.getString(cursor.getColumnIndex("DEPTID"));
            this.status = cursor.getInt(cursor.getColumnIndex("STATUS"));
            this.attenderid = cursor.getString(cursor.getColumnIndex("ATTENDER_ID"));
            this.lastmsgtime = cursor.getLong(cursor.getColumnIndex("LMTIME"));
            this.attenderEmail = cursor.getString(cursor.getColumnIndex("ATTENDER_EMAIL"));
            this.deptname = cursor.getString(cursor.getColumnIndex("DEPTNAME"));
            this.draft = cursor.getString(cursor.getColumnIndex("DRAFT"));
            this.show_continue_chat = cursor.getInt(cursor.getColumnIndex("SHOW_CONTINUE_CHAT")) == 1;
            this.rchatid = cursor.getString(cursor.getColumnIndex("RCHATID"));
            this.unread_count = cursor.getInt(cursor.getColumnIndex("UNREAD_COUNT"));
            this.startTime = cursor.getLong(cursor.getColumnIndex("TIMER_START_TIME"));
            this.endTime = cursor.getInt(cursor.getColumnIndex("TIMER_END_TIME"));
            this.feedback = cursor.getString(cursor.getColumnIndex("FEEDBACK"));
            this.rating = cursor.getInt(cursor.getColumnIndex("RATING"));
            int i10 = cursor.getInt(cursor.getColumnIndex("QUEUEPOSITION"));
            this.queuePosition = i10;
            if (i10 == 0) {
                this.queuePosition = -1;
            }
            this.showQueue = cursor.getInt(cursor.getColumnIndex("SHOW_QUEUE")) == 1;
            this.queueStartTime = cursor.getLong(cursor.getColumnIndex("QUEUE_START_TIME"));
            this.queueEndTime = cursor.getLong(cursor.getColumnIndex("QUEUE_END_TIME"));
            this.waitingTimerStartTime = cursor.getLong(cursor.getColumnIndex("WAITING_TIMER_START_TIME"));
            this.unreadChat = cursor.getInt(cursor.getColumnIndex("UNREAD_CHAT")) == 1;
            this.chatEndTime = cursor.getLong(cursor.getColumnIndex("END_TIME"));
            this.missedTime = cursor.getLong(cursor.getColumnIndex("MISSED_TIME"));
            this.chatLastInitiatedTime = Long.valueOf(cursor.getLong(cursor.getColumnIndex("LAST_INITIATED_TIME")));
            this.isTopSyncCompleted = cursor.getLong(cursor.getColumnIndex("SYNC_TIME")) == -2;
            this.type = c.from(cursor.getString(cursor.getColumnIndex("TYPE")));
            this.media = (Media) AbstractC5895g.b(Yd.a.j(), cursor.getString(cursor.getColumnIndex("MEDIA")), Media.class);
            this.extras = (Extras) AbstractC5895g.b(Yd.a.j(), cursor.getString(cursor.getColumnIndex("EXTRAS")), Extras.class);
            this.isCallEnabledForAttender = cursor.getInt(cursor.getColumnIndex("IS_CALL_ENABLED_FOR_ATTENDER")) == 1;
            this.statusKey = cursor.getString(cursor.getColumnIndex("STATUS_KEY"));
            this.triggerData = (b) AbstractC5895g.b(Yd.a.j(), cursor.getString(cursor.getColumnIndex("TRIGGER_DATA")), b.class);
        } catch (Exception e10) {
            LiveChatUtil.log(e10);
        }
    }
}
