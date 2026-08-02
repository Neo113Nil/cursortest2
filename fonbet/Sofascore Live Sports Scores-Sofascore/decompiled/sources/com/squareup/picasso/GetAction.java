package com.squareup.picasso;

import android.graphics.Bitmap;
import com.squareup.picasso.Picasso;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
class GetAction extends Action<Void> {
    public GetAction(Picasso picasso, Request request, int i, int i2, Object obj, String str) {
        super(picasso, null, request, i, i2, 0, null, str, obj, false);
    }

    @Override // com.squareup.picasso.Action
    public void error(Exception exc) {
    }

    @Override // com.squareup.picasso.Action
    public void complete(Bitmap bitmap, Picasso.LoadedFrom loadedFrom) {
    }
}
