package com.google.firebase.messaging.reporting;

import xsna.p8e0;

/* loaded from: classes13.dex */
public final class MessagingClientEvent {
    public final long a;
    public final String b;
    public final String c;
    public final MessageType d;
    public final SDKPlatform e;
    public final String f;
    public final String g;
    public final int h;
    public final String i;
    public final Event j;
    public final String k;
    public final String l;

    public enum Event implements p8e0 {
        UNKNOWN_EVENT(0),
        MESSAGE_DELIVERED(1),
        MESSAGE_OPEN(2);

        private final int number_;

        Event(int i) {
            this.number_ = i;
        }

        @Override // xsna.p8e0
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum MessageType implements p8e0 {
        UNKNOWN(0),
        DATA_MESSAGE(1),
        TOPIC(2),
        DISPLAY_NOTIFICATION(3);

        private final int number_;

        MessageType(int i) {
            this.number_ = i;
        }

        @Override // xsna.p8e0
        public final int getNumber() {
            return this.number_;
        }
    }

    public enum SDKPlatform implements p8e0 {
        UNKNOWN_OS(0),
        ANDROID(1),
        IOS(2),
        WEB(3);

        private final int number_;

        SDKPlatform(int i) {
            this.number_ = i;
        }

        @Override // xsna.p8e0
        public final int getNumber() {
            return this.number_;
        }
    }

    public static final class a {
        public long a;
        public String b;
        public String c;
        public MessageType d;
        public SDKPlatform e;
        public String f;
        public String g;
        public int h;
        public String i;
        public Event j;
        public String k;
        public String l;

        public final MessagingClientEvent a() {
            return new MessagingClientEvent(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l);
        }

        public final void b(String str) {
            this.k = str;
        }

        public final void c(String str) {
            this.g = str;
        }

        public final void d(String str) {
            this.l = str;
        }

        public final void e(Event event) {
            this.j = event;
        }

        public final void f(String str) {
            this.c = str;
        }

        public final void g(String str) {
            this.b = str;
        }

        public final void h(MessageType messageType) {
            this.d = messageType;
        }

        public final void i(String str) {
            this.f = str;
        }

        public final void j(long j) {
            this.a = j;
        }

        public final void k(SDKPlatform sDKPlatform) {
            this.e = sDKPlatform;
        }

        public final void l(String str) {
            this.i = str;
        }

        public final void m(int i) {
            this.h = i;
        }
    }

    public MessagingClientEvent(long j, String str, String str2, MessageType messageType, SDKPlatform sDKPlatform, String str3, String str4, int i, String str5, Event event, String str6, String str7) {
        this.a = j;
        this.b = str;
        this.c = str2;
        this.d = messageType;
        this.e = sDKPlatform;
        this.f = str3;
        this.g = str4;
        this.h = i;
        this.i = str5;
        this.j = event;
        this.k = str6;
        this.l = str7;
    }

    public static a a() {
        a aVar = new a();
        aVar.a = 0L;
        aVar.b = "";
        aVar.c = "";
        aVar.d = MessageType.UNKNOWN;
        aVar.e = SDKPlatform.UNKNOWN_OS;
        aVar.f = "";
        aVar.g = "";
        aVar.h = 0;
        aVar.i = "";
        aVar.j = Event.UNKNOWN_EVENT;
        aVar.k = "";
        aVar.l = "";
        return aVar;
    }
}
