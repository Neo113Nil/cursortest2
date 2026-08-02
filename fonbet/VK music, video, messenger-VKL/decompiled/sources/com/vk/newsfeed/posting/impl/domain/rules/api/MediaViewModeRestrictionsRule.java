package com.vk.newsfeed.posting.impl.domain.rules.api;

import android.os.Parcel;
import com.vk.core.serialize.Serializer;
import com.vk.newsfeed.posting.api.model.PhotoVideoDisplayMode;
import com.vk.newsfeed.posting.impl.domain.model.ActionsAvailabilityState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessage;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageButton;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageIcon;
import com.vk.newsfeed.posting.impl.domain.model.messages.PostingUserMessageText;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.domain.rules.RuleAttachment;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import xsna.c5g;
import xsna.epx;
import xsna.j5g;
import xsna.nrg0;
import xsna.xmc0;

/* compiled from: MediaViewModeRestrictionsRule.kt */
/* loaded from: classes4.dex */
public final class MediaViewModeRestrictionsRule implements PostingRule {
    public static final Serializer.c<MediaViewModeRestrictionsRule> CREATOR = new a();
    public final PhotoVideoDisplayMode b;
    public final Set<RuleAttachment> c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    /* compiled from: Serializer.kt */
    public static final class a extends Serializer.c<MediaViewModeRestrictionsRule> {
        /* JADX WARN: Code restructure failed: missing block: B:10:0x0029, code lost:
        
            if (r2 == null) goto L15;
         */
        @Override // com.vk.core.serialize.Serializer.c
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final MediaViewModeRestrictionsRule a(Serializer serializer) {
            PhotoVideoDisplayMode photoVideoDisplayMode;
            Object obj;
            String H = serializer.H();
            if (H != null) {
                Iterator<E> it = PhotoVideoDisplayMode.h().iterator();
                while (true) {
                    if (!it.hasNext()) {
                        obj = null;
                        break;
                    }
                    obj = it.next();
                    if (epx.f(((PhotoVideoDisplayMode) obj).name(), H)) {
                        break;
                    }
                }
                photoVideoDisplayMode = (PhotoVideoDisplayMode) obj;
            }
            photoVideoDisplayMode = PhotoVideoDisplayMode.Carousel;
            return new MediaViewModeRestrictionsRule(photoVideoDisplayMode, j5g.S0(serializer.B(RuleAttachment.class.getClassLoader())), serializer.I(), serializer.I(), serializer.I(), serializer.I());
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new MediaViewModeRestrictionsRule[i];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public MediaViewModeRestrictionsRule(PhotoVideoDisplayMode photoVideoDisplayMode, Set<? extends RuleAttachment> set, String str, String str2, String str3, String str4) {
        this.b = photoVideoDisplayMode;
        this.c = set;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final PostingRule.a F2(xmc0 xmc0Var) {
        PostingUserMessage.PopupDialog popupDialog;
        String str;
        String str2;
        PhotoVideoDisplayMode photoVideoDisplayMode = xmc0Var.a.i.k;
        Set<RuleAttachment> a2 = xmc0Var.a();
        Set<RuleAttachment> set = this.c;
        LinkedHashSet d0 = j5g.d0(a2, set);
        int b = xmc0Var.b(RuleAttachment.Photo);
        PhotoVideoDisplayMode photoVideoDisplayMode2 = this.b;
        if (photoVideoDisplayMode == photoVideoDisplayMode2 && b > 1) {
            String str3 = this.e;
            if (str3 != null && (str = this.f) != null && (str2 = this.g) != null) {
                for (PhotoVideoDisplayMode photoVideoDisplayMode3 : PhotoVideoDisplayMode.h()) {
                    if (photoVideoDisplayMode3 != photoVideoDisplayMode2) {
                        popupDialog = new PostingUserMessage.PopupDialog(new PostingUserMessageIcon(R.drawable.vk_icon_carousel_outline_20, R.attr.vk_ui_icon_accent), new PostingUserMessageText.StringText(str3), new PostingUserMessageText.StringText(str), new PostingUserMessageButton(new PostingUserMessageText.StringText(str2), new PostingAction.Editing.SetPhotoVideoDisplayMode(photoVideoDisplayMode3, true), null, true, 4, null));
                    }
                }
                throw new NoSuchElementException("Collection contains no element matching the predicate.");
            }
            popupDialog = null;
            Iterator<T> it = set.iterator();
            while (it.hasNext()) {
                xmc0Var.f((RuleAttachment) it.next(), popupDialog);
            }
        }
        if (!d0.isEmpty()) {
            String str4 = this.d;
            PostingUserMessage.Snackbar snackbar = str4 != null ? new PostingUserMessage.Snackbar(new PostingUserMessageIcon(R.drawable.vk_icon_error_outline_28, R.attr.vk_ui_icon_warning), new PostingUserMessageText.StringText(str4), new PostingUserMessageButton(new PostingUserMessageText.ResText(R.string.snackbar_action_accessibly), null, null, false, 14, null)) : null;
            if (photoVideoDisplayMode == photoVideoDisplayMode2 && b >= 2) {
                xmc0Var.h(snackbar);
                return new PostingRule.a.b(new PostingUserMessage.Service(this, null, false, 6, null));
            }
            ActionsAvailabilityState.Availability.NotAvailable notAvailable = new ActionsAvailabilityState.Availability.NotAvailable(snackbar);
            ActionsAvailabilityState actionsAvailabilityState = xmc0Var.g;
            xmc0Var.g = ActionsAvailabilityState.a(actionsAvailabilityState, null, null, null, actionsAvailabilityState.h.m5(notAvailable), null, 191);
        }
        return PostingRule.a.C1431a.b;
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.name());
        serializer.f0(j5g.O0(this.c));
        serializer.m0(this.d);
        serializer.m0(this.e);
        serializer.m0(this.f);
        serializer.m0(this.g);
    }

    @Override // com.vk.newsfeed.posting.impl.domain.rules.PostingRule
    public final List<nrg0> c6(xmc0 xmc0Var) {
        Set<RuleAttachment> set = this.c;
        ArrayList arrayList = new ArrayList(c5g.u(set, 10));
        Iterator<T> it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(new nrg0((RuleAttachment) it.next(), 0));
        }
        return j5g.O0(arrayList);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        Serializer.StreamParcelable.a.a(this, parcel);
    }
}
