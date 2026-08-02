package com.vk.voip.ui.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import ru.ok.android.externcalls.sdk.layout.ConversationVideoTrackParticipantKey;
import ru.ok.android.externcalls.sdk.ui.TextureViewRenderer;
import xsna.epx;
import xsna.rct0;

/* compiled from: VideoView.kt */
/* loaded from: classes7.dex */
public final class VideoView extends FrameLayout {
    public rct0 b;
    public ConversationVideoTrackParticipantKey c;
    public TextureViewRenderer d;

    public VideoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    public final void a(rct0 rct0Var, ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey) {
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey2;
        TextureViewRenderer textureViewRenderer;
        if (!epx.f(this.b, rct0Var)) {
            b();
        }
        if (epx.f(this.c, conversationVideoTrackParticipantKey)) {
            return;
        }
        rct0 rct0Var2 = this.b;
        if (rct0Var2 != null && (conversationVideoTrackParticipantKey2 = this.c) != null && (textureViewRenderer = this.d) != null) {
            rct0Var2.removeParticipantView(conversationVideoTrackParticipantKey2, textureViewRenderer);
        }
        this.b = rct0Var;
        this.c = conversationVideoTrackParticipantKey;
        if (this.d == null) {
            TextureViewRenderer mo349createVideoViewInstance = rct0Var.mo349createVideoViewInstance(getContext());
            this.d = mo349createVideoViewInstance;
            addView(mo349createVideoViewInstance);
        }
        this.b.setParticipantView(this.c, this.d);
    }

    public final void b() {
        ConversationVideoTrackParticipantKey conversationVideoTrackParticipantKey;
        TextureViewRenderer textureViewRenderer;
        rct0 rct0Var = this.b;
        if (rct0Var != null && (conversationVideoTrackParticipantKey = this.c) != null && (textureViewRenderer = this.d) != null) {
            rct0Var.removeParticipantView(conversationVideoTrackParticipantKey, textureViewRenderer);
            this.b.releaseParticipantView(this.d);
            removeAllViews();
        }
        this.b = null;
        this.c = null;
        this.d = null;
    }
}
