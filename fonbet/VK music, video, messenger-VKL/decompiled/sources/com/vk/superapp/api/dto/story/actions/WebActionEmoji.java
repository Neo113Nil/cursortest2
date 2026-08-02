package com.vk.superapp.api.dto.story.actions;

import com.vk.core.serialize.Serializer;
import com.vk.superapp.api.dto.story.WebStickerType;
import java.util.Arrays;
import org.json.JSONObject;
import xsna.epx;
import xsna.ho8;

/* compiled from: WebActionEmoji.kt */
/* loaded from: classes6.dex */
public final class WebActionEmoji extends StickerAction {
    public static final Serializer.c<WebActionEmoji> CREATOR = new b();
    public static final String[] d = {"1f600", "1f62c", "1f601", "1f602", "1f603", "1f604", "1f605", "1f606", "1f607", "1f609", "1f60a", "1f642", "1f643", "263a", "1f60b", "1f60c", "1f60d", "1f618", "1f617", "1f619", "1f61a", "1f61c", "1f61d", "1f61b", "1f911", "1f913", "1f60e", "1f917", "1f60f", "1f636", "1f610", "1f611", "1f612", "1f644", "1f914", "1f633", "1f61e", "1f61f", "1f620", "1f621", "1f614", "1f615", "1f641", "2639", "1f623", "1f616", "1f62b", "1f629", "1f624", "1f62e", "1f631", "1f628", "1f630", "1f62f", "1f626", "1f627", "1f622", "1f625", "1f62a", "1f613", "1f62d", "1f635", "1f632", "1f910", "1f637", "1f912", "1f915", "1f634", "1f4a4", "1f4a9", "1f608", "1f47f", "1f479", "1f47a", "1f480", "1f47b", "1f47d", "1f916", "1f63a", "1f638", "1f639", "1f63b", "1f63c", "1f63d", "1f640", "1f63f", "1f63e", "1f64c", "1f44f", "1f44b", "1f44d", "1f44e", "1f44a", "270a", "270c", "1f44c", "270b", "1f450", "1f4aa", "1f64f", "261d", "1f446", "1f447", "1f448", "1f449", "1f595", "1f590", "1f918", "1f596", "1f48b", "1f436", "1f431", "1f42d", "1f439", "1f430", "1f43b", "1f43c", "1f428", "1f42f", "1f981", "1f42e", "1f437", "1f43d", "1f438", "1f419", "1f435", "1f648", "1f649", "1f64a", "1f412", "1f414", "1f427", "1f426", "1f424", "1f423", "1f425", "1f43a", "1f417", "1f434", "1f984", "1f31a", "1f31d", "1f31e", "2728", "26a1", "1f525", "1f4a5", "2764", "1f49b", "1f49a", "1f499", "1f49c", "1f494", "2763", "1f495", "1f49e", "1f493", "1f497", "1f496", "1f498", "1f49d", "1f49f"};
    public final String b;
    public final WebStickerType c;

    /* compiled from: WebActionEmoji.kt */
    public static final class a {
        public static String a(String str) {
            StringBuilder sb = new StringBuilder();
            int i = 0;
            while (i < str.length()) {
                int codePointAt = Character.codePointAt(str, i);
                int charCount = Character.charCount(codePointAt);
                if (charCount > 1 && (i = i + (charCount - 1)) >= str.length()) {
                    return null;
                }
                if (codePointAt < 128) {
                    sb.appendCodePoint(codePointAt);
                } else {
                    sb.append(String.format("%x", Arrays.copyOf(new Object[]{Integer.valueOf(codePointAt)}, 1)));
                }
                i++;
            }
            return sb.toString();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<WebActionEmoji> {
        @Override // com.vk.core.serialize.Serializer.c
        public final WebActionEmoji a(Serializer serializer) {
            return new WebActionEmoji(serializer);
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new WebActionEmoji[i];
        }
    }

    public WebActionEmoji(String str) {
        this.b = str;
        this.c = WebStickerType.EMOJI;
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final JSONObject Ab() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("emoji", this.b);
        return jSONObject;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof WebActionEmoji) && epx.f(this.b, ((WebActionEmoji) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return ho8.a(new StringBuilder("WebActionEmoji(emoji="), this.b, ')');
    }

    @Override // com.vk.superapp.api.dto.story.actions.StickerAction
    public final WebStickerType zb() {
        return this.c;
    }

    public WebActionEmoji(Serializer serializer) {
        this(serializer.H());
    }
}
