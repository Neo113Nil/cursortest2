package te;

import android.app.Application;
import com.google.gson.k;
import com.zoho.livechat.android.modules.core.domain.entities.Channel;
import com.zoho.livechat.android.provider.MobilistenInitProvider;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import od.t;
import og.AbstractC5896h;

/* renamed from: te.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC6462a {

    /* renamed from: te.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0915a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Channel.CDN.a.values().length];
            try {
                iArr[Channel.CDN.a.Ping.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Channel.CDN.a.OnHold.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Channel.CDN.a.Waiting.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[Channel.CDN.a.Ringtone.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[Channel.CDN.a.Buzz.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[Channel.CDN.a.ShortNotification.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final String a(Channel channel) {
        Channel.CallConfigurations callConfigurations;
        Channel.CallConfigurations.Messages messages;
        String offlineResponse;
        if (channel != null && (callConfigurations = channel.getCallConfigurations()) != null && (messages = callConfigurations.getMessages()) != null && (offlineResponse = messages.getOfflineResponse()) != null) {
            if (offlineResponse.length() <= 0) {
                offlineResponse = null;
            }
            if (offlineResponse != null) {
                return offlineResponse;
            }
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        String string = e10 != null ? e10.getString(t.f60862F4) : null;
        return string == null ? "" : string;
    }

    public static final String b(Channel channel) {
        Channel.Chat chat;
        Channel.Chat.AgentsOffline agentsOffline;
        String response;
        if (channel != null && (chat = channel.getChat()) != null && (agentsOffline = chat.getAgentsOffline()) != null && (response = agentsOffline.getResponse()) != null) {
            if (response.length() <= 0) {
                response = null;
            }
            if (response != null) {
                return response;
            }
        }
        Application e10 = MobilistenInitProvider.INSTANCE.e();
        String string = e10 != null ? e10.getString(t.f60868G4) : null;
        return string == null ? "" : string;
    }

    public static final String c(Channel channel, Channel.CDN.a type) {
        Channel.CDN cdn;
        k mediaFileHashes;
        Channel.Media media;
        String server;
        String str;
        Intrinsics.checkNotNullParameter(type, "type");
        if (channel == null || (cdn = channel.getCdn()) == null || (mediaFileHashes = cdn.getMediaFileHashes()) == null || (media = channel.getMedia()) == null || (server = media.getServer()) == null) {
            return null;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(server);
        sb2.append("/sound/");
        switch (C0915a.$EnumSwitchMapping$0[type.ordinal()]) {
            case 1:
                str = "ping_" + AbstractC5896h.f(mediaFileHashes.r("sound/ping.mp3"));
                break;
            case 2:
                str = "hold_" + AbstractC5896h.f(mediaFileHashes.r("sound/hold.mp3"));
                break;
            case 3:
                str = "waiting_" + AbstractC5896h.f(mediaFileHashes.r("sound/waiting.mp3"));
                break;
            case 4:
                str = "ringtone_" + AbstractC5896h.f(mediaFileHashes.r("sound/ringtone.mp3"));
                break;
            case 5:
                str = "buzz_" + AbstractC5896h.f(mediaFileHashes.r("sound/buzz.mp3"));
                break;
            case 6:
                str = "shortnotification_" + AbstractC5896h.f(mediaFileHashes.r("sound/shortnotification.mp3"));
                break;
            default:
                throw new NoWhenBranchMatchedException();
        }
        sb2.append(str);
        sb2.append("_.mp3");
        return sb2.toString();
    }
}
