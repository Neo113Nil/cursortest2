package com.vk.im.reporters.api.channel;

import com.vk.im.engine.models.messages.MsgFromChannel;
import xsna.asp;
import xsna.eik0;
import xsna.mdz;
import xsna.zrp;

/* compiled from: ChannelStubAttachesReporter.kt */
/* loaded from: classes2.dex */
public interface ChannelStubAttachesReporter extends eik0<mdz<Span>, Object> {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ChannelStubAttachesReporter.kt */
    public static final class Span {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Span[] $VALUES;
        public static final Span ATTACH_STUB_LOAD;

        static {
            Span span = new Span("ATTACH_STUB_LOAD", 0);
            ATTACH_STUB_LOAD = span;
            Span[] spanArr = {span};
            $VALUES = spanArr;
            $ENTRIES = new asp(spanArr);
        }

        public Span() {
            throw null;
        }

        public static Span valueOf(String str) {
            return (Span) Enum.valueOf(Span.class, str);
        }

        public static Span[] values() {
            return (Span[]) $VALUES.clone();
        }
    }

    void a();

    void j(int i);

    void o(MsgFromChannel msgFromChannel);

    /* compiled from: ChannelStubAttachesReporter.kt */
    public static final class a {
        public static final C1135a a = new C1135a();

        /* compiled from: ChannelStubAttachesReporter.kt */
        /* renamed from: com.vk.im.reporters.api.channel.ChannelStubAttachesReporter$a$a, reason: collision with other inner class name */
        public static final class C1135a implements ChannelStubAttachesReporter {
            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void c(Object obj) {
            }

            @Override // xsna.eik0
            public final /* bridge */ /* synthetic */ void f(mdz<Span> mdzVar, Object obj) {
            }

            @Override // xsna.eik0
            public final boolean h() {
                return false;
            }

            @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
            public final void a() {
            }

            @Override // xsna.eik0
            public final void b() {
            }

            @Override // xsna.eik0
            public final void d(Object obj) {
            }

            @Override // xsna.eik0
            public final void g(String str) {
            }

            @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
            public final void j(int i) {
            }

            @Override // xsna.eik0
            public final void m(String str) {
            }

            @Override // xsna.eik0
            public final void n(Object obj) {
            }

            @Override // com.vk.im.reporters.api.channel.ChannelStubAttachesReporter
            public final void o(MsgFromChannel msgFromChannel) {
            }
        }
    }
}
