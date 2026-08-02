package com.vk.newsfeed.posting.impl.domain.model;

import android.os.Parcelable;
import com.vk.dto.common.Attachment;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerSelectedItem;
import com.vk.newsfeed.posting.impl.domain.model.MediaPickerState;
import com.vk.newsfeed.posting.impl.domain.model.PostingAction;
import com.vk.newsfeed.posting.impl.domain.request.ParsedAttachment;
import com.vk.newsfeed.posting.impl.domain.rules.PostingRule;
import com.vk.newsfeed.posting.impl.presentation.model.PostingGroupInfo;
import com.vk.newsfeed.posting.impl.presentation.model.PostingSettings;
import defpackage.q0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import xsna.cjl0;
import xsna.epx;
import xsna.ms9;
import xsna.oq;
import xsna.shy;
import xsna.uqi;
import xsna.ur;
import xsna.vu5;
import xsna.xl50;

/* compiled from: PostingPatch.kt */
/* loaded from: classes4.dex */
public interface e extends xl50 {

    /* compiled from: PostingPatch.kt */
    public interface a extends e {

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$a$a, reason: collision with other inner class name */
        public static final class C1421a implements a {
            public final Set<Integer> b;

            public C1421a(Set<Integer> set) {
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1421a) && epx.f(this.b, ((C1421a) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ur.c(new StringBuilder("AddPendingPhotoTags(photoIds="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class b implements a {
            public final PostingAction.Fetch.CheckEditPostRules b;
            public final PostingAction.Fetch.ErrorCheckEditPostRules c;

            public b(PostingAction.Fetch.CheckEditPostRules checkEditPostRules, PostingAction.Fetch.ErrorCheckEditPostRules errorCheckEditPostRules) {
                this.b = checkEditPostRules;
                this.c = errorCheckEditPostRules;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return epx.f(this.b, bVar.b) && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "AddWaitingSettingsAction(action=" + this.b + ", errorAction=" + this.c + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class c implements a {
            public final List<PostingGroupInfo> b;

            public c(List<PostingGroupInfo> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof c) && epx.f(this.b, ((c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("LoadedGroupsInfo(loadResult="), this.b);
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class d implements a {
            public final PostingHints b;

            public d(PostingHints postingHints) {
                this.b = postingHints;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "LoadedHints(hints=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$a$e, reason: collision with other inner class name */
        public static final class C1422e implements a {
            public final PostingSettings b;

            public C1422e(PostingSettings postingSettings) {
                this.b = postingSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1422e) && epx.f(this.b, ((C1422e) obj).b);
            }

            public final int hashCode() {
                PostingSettings postingSettings = this.b;
                if (postingSettings == null) {
                    return 0;
                }
                return postingSettings.hashCode();
            }

            public final String toString() {
                return "LoadedLocalSettings(loadResult=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class f implements a {
            public final boolean b;
            public final boolean c;

            public f(boolean z, boolean z2) {
                this.b = z;
                this.c = z2;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof f)) {
                    return false;
                }
                f fVar = (f) obj;
                return this.b == fVar.b && this.c == fVar.c;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.c) + (Boolean.hashCode(this.b) * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("LoadedPermissions(canAccessCamera=");
                sb.append(this.b);
                sb.append(", canAccessGallery=");
                return q0.a(sb, this.c, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class g implements a {
            public final Map<Integer, List<PhotoTag>> b;

            /* JADX WARN: Multi-variable type inference failed */
            public g(Map<Integer, ? extends List<PhotoTag>> map) {
                this.b = map;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && epx.f(this.b, ((g) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return cjl0.a(new StringBuilder("LoadedPhotoTags(photoTags="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class h implements a {
            public final Set<Integer> b;

            public h(Set<Integer> set) {
                this.b = set;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof h) && epx.f(this.b, ((h) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ur.c(new StringBuilder("RemovePendingPhotoTags(photoIds="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class i implements a {
            public final boolean b;

            public i(boolean z) {
                this.b = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.b);
            }

            public final String toString() {
                return q0.a(new StringBuilder("SetIsWaitingExplicit(isExplicit="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class j implements a {
            public final LoadingState b;
            public final PostingSettings c;

            public j(LoadingState loadingState, PostingSettings postingSettings) {
                this.b = loadingState;
                this.c = postingSettings;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof j)) {
                    return false;
                }
                j jVar = (j) obj;
                return this.b == jVar.b && epx.f(this.c, jVar.c);
            }

            public final int hashCode() {
                int hashCode = this.b.hashCode() * 31;
                PostingSettings postingSettings = this.c;
                return hashCode + (postingSettings == null ? 0 : postingSettings.hashCode());
            }

            public final String toString() {
                return "SettingsLoadingState(state=" + this.b + ", loadResult=" + this.c + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class k implements a {
            public final PostingHints b;

            public k(PostingHints postingHints) {
                this.b = postingHints;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof k) && epx.f(this.b, ((k) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "UpdatedHints(hints=" + this.b + ')';
            }
        }
    }

    /* compiled from: PostingPatch.kt */
    public interface b extends e {

        /* compiled from: PostingPatch.kt */
        public static final class a implements b {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("AlbumSelected(id="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$b$b, reason: collision with other inner class name */
        public static final class C1423b implements b {
            public final List<LocalAlbum> b;

            public C1423b(List<LocalAlbum> list) {
                this.b = list;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1423b) && epx.f(this.b, ((C1423b) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return ms9.a(')', new StringBuilder("LocalAlbumsChanged(localAlbums="), this.b);
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class c implements b {
            public final ArrayList b;
            public final int c;

            public c(ArrayList arrayList, int i) {
                this.b = arrayList;
                this.c = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b.equals(cVar.b) && this.c == cVar.c;
            }

            public final int hashCode() {
                return Integer.hashCode(this.c) + (this.b.hashCode() * 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("MediaEntriesChanged(entries=");
                sb.append(this.b);
                sb.append(", totalMediaCount=");
                return vu5.b(sb, this.c, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class d implements b {
            public final LocalAlbum b;
            public final int c;
            public final int d;
            public final MediaPickerPageLoadType e;

            public d(LocalAlbum localAlbum, int i, int i2, MediaPickerPageLoadType mediaPickerPageLoadType) {
                this.b = localAlbum;
                this.c = i;
                this.d = i2;
                this.e = mediaPickerPageLoadType;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return epx.f(this.b, dVar.b) && this.c == dVar.c && this.d == dVar.d && this.e == dVar.e;
            }

            public final int hashCode() {
                return this.e.hashCode() + shy.a(this.d, shy.a(this.c, this.b.hashCode() * 31, 31), 31);
            }

            public final String toString() {
                return "MediaLoadingNextPage(album=" + this.b + ", offset=" + this.c + ", count=" + this.d + ", loadType=" + this.e + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$b$e, reason: collision with other inner class name */
        public static final class C1424e implements b {
            public final ArrayList b;

            public C1424e(ArrayList arrayList) {
                this.b = arrayList;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1424e) && this.b.equals(((C1424e) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return io.reactivex.rxjava3.internal.operators.mixed.j.b(')', new StringBuilder("MediaPageLoaded(entries="), this.b);
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class f implements b {
            public static final f b = new f();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof f);
            }

            public final int hashCode() {
                return 2133321452;
            }

            public final String toString() {
                return "MediaPageLoadingFailed";
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class g implements b {
            public final MediaPickerState.SheetState b;

            public g(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof g) && this.b == ((g) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OnTransitionedToState(state=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public interface h extends b {

            /* compiled from: PostingPatch.kt */
            public static final class a implements h {
                public final ParsedAttachment b;

                public a(ParsedAttachment parsedAttachment) {
                    this.b = parsedAttachment;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof a) && epx.f(this.b, ((a) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "LinkAttachmentParsed(parsedAttachment=" + this.b + ')';
                }
            }

            /* compiled from: PostingPatch.kt */
            /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$b$h$b, reason: collision with other inner class name */
            public static final class C1425b implements h {
                public final MediaPickerSelectedItem.LocalMedia b;
                public final Integer c;

                public C1425b(MediaPickerSelectedItem.LocalMedia localMedia, Integer num) {
                    this.b = localMedia;
                    this.c = num;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1425b)) {
                        return false;
                    }
                    C1425b c1425b = (C1425b) obj;
                    return epx.f(this.b, c1425b.b) && epx.f(this.c, c1425b.c);
                }

                public final int hashCode() {
                    int hashCode = this.b.b.hashCode() * 31;
                    Integer num = this.c;
                    return hashCode + (num == null ? 0 : num.hashCode());
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("LocalMediaAddedAtIndex(item=");
                    sb.append(this.b);
                    sb.append(", index=");
                    return uqi.b(sb, this.c, ')');
                }
            }

            /* compiled from: PostingPatch.kt */
            public static final class c implements h {
                public final MediaPickerSelectedItem.LocalMedia b;
                public final boolean c;

                public c(MediaPickerSelectedItem.LocalMedia localMedia, boolean z) {
                    this.b = localMedia;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof c)) {
                        return false;
                    }
                    c cVar = (c) obj;
                    return epx.f(this.b, cVar.b) && this.c == cVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("LocalMediaSelected(item=");
                    sb.append(this.b);
                    sb.append(", isSelected=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: PostingPatch.kt */
            public static final class d implements h {
                public final Attachment b;

                public d(Attachment attachment) {
                    this.b = attachment;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
                }

                public final int hashCode() {
                    return this.b.hashCode();
                }

                public final String toString() {
                    return "RemoveAttachment(attachment=" + this.b + ')';
                }
            }

            /* compiled from: PostingPatch.kt */
            /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$b$h$e, reason: collision with other inner class name */
            public static final class C1426e implements h {
                public final VkMediaEntry$VkPhoto b;
                public final boolean c;

                public C1426e(VkMediaEntry$VkPhoto vkMediaEntry$VkPhoto, boolean z) {
                    this.b = vkMediaEntry$VkPhoto;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C1426e)) {
                        return false;
                    }
                    C1426e c1426e = (C1426e) obj;
                    return epx.f(this.b, c1426e.b) && this.c == c1426e.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("VkPhotoSelectionChanged(entry=");
                    sb.append(this.b);
                    sb.append(", isSelected=");
                    return q0.a(sb, this.c, ')');
                }
            }

            /* compiled from: PostingPatch.kt */
            public static final class f implements h {
                public final VkMediaEntry$VkVideo b;
                public final boolean c;

                public f(VkMediaEntry$VkVideo vkMediaEntry$VkVideo, boolean z) {
                    this.b = vkMediaEntry$VkVideo;
                    this.c = z;
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof f)) {
                        return false;
                    }
                    f fVar = (f) obj;
                    return epx.f(this.b, fVar.b) && this.c == fVar.c;
                }

                public final int hashCode() {
                    return Boolean.hashCode(this.c) + (this.b.b.hashCode() * 31);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("VkVideoSelectionChanged(entry=");
                    sb.append(this.b);
                    sb.append(", isSelected=");
                    return q0.a(sb, this.c, ')');
                }
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class i implements b {
            public final MediaPickerState.SheetState b;

            public i(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof i) && this.b == ((i) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "StateChanged(currentState=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class j implements b {
            public final MediaPickerState.SheetState b;

            public j(MediaPickerState.SheetState sheetState) {
                this.b = sheetState;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof j) && this.b == ((j) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "TransitionToState(nextState=" + this.b + ')';
            }
        }
    }

    /* compiled from: PostingPatch.kt */
    public interface c extends e {

        /* compiled from: PostingPatch.kt */
        public static final class a implements c {
            public static final a b = new a();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return -1459176384;
            }

            public final String toString() {
                return "ClearCurrentStepStack";
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class b implements c {
            public static final b b = new b();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof b);
            }

            public final int hashCode() {
                return 1862521400;
            }

            public final String toString() {
                return "CloseInCurrentStep";
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$c$c, reason: collision with other inner class name */
        public static final class C1427c implements c {
            public final PostingStep b;

            public C1427c(PostingStep postingStep) {
                this.b = postingStep;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof C1427c) && epx.f(this.b, ((C1427c) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "NextStep(step=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class d implements c {
            public final PostingStep b;

            public d(PostingStep postingStep) {
                this.b = postingStep;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof d) && epx.f(this.b, ((d) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "OpenInCurrentStep(step=" + this.b + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$c$e, reason: collision with other inner class name */
        public static final class C1428e implements c {
            public static final C1428e b = new C1428e();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof C1428e);
            }

            public final int hashCode() {
                return -318319053;
            }

            public final String toString() {
                return "PreviousStep";
            }
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class d implements e {
        public final boolean b;

        public d(boolean z) {
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof d) && this.b == ((d) obj).b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b);
        }

        public final String toString() {
            return q0.a(new StringBuilder("NetworkStateChanged(isNetworkAvailable="), this.b, ')');
        }
    }

    /* compiled from: PostingPatch.kt */
    /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$e, reason: collision with other inner class name */
    public static final class C1429e implements e {
        public final PermissionType b;

        public C1429e(PermissionType permissionType) {
            this.b = permissionType;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C1429e) && this.b == ((C1429e) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "PermissionGranted(permissionType=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public interface f extends e {
    }

    /* compiled from: PostingPatch.kt */
    public static final class g implements e {
        public final PublicationState b;

        public g(PublicationState publicationState) {
            this.b = publicationState;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof g) && this.b == ((g) obj).b;
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return "UpdatePublishState(publicationState=" + this.b + ')';
        }
    }

    /* compiled from: PostingPatch.kt */
    public interface h extends e {

        /* compiled from: PostingPatch.kt */
        public static final class a implements h {
            public final int b;

            public a(int i) {
                this.b = i;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && this.b == ((a) obj).b;
            }

            public final int hashCode() {
                return Integer.hashCode(this.b);
            }

            public final String toString() {
                return vu5.b(new StringBuilder("UploadCancel(uploadId="), this.b, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class b implements h {
            public final int b;
            public final Parcelable c;

            public b(int i, Parcelable parcelable) {
                this.b = i;
                this.c = parcelable;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof b)) {
                    return false;
                }
                b bVar = (b) obj;
                return this.b == bVar.b && epx.f(this.c, bVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                Parcelable parcelable = this.c;
                return hashCode + (parcelable == null ? 0 : parcelable.hashCode());
            }

            public final String toString() {
                return "UploadDone(uploadId=" + this.b + ", uploadedObj=" + this.c + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class c implements h {
            public final int b;
            public final Throwable c;

            public c(int i, Throwable th) {
                this.b = i;
                this.c = th;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof c)) {
                    return false;
                }
                c cVar = (c) obj;
                return this.b == cVar.b && epx.f(this.c, cVar.c);
            }

            public final int hashCode() {
                int hashCode = Integer.hashCode(this.b) * 31;
                Throwable th = this.c;
                return hashCode + (th == null ? 0 : th.hashCode());
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadFailed(uploadId=");
                sb.append(this.b);
                sb.append(", throwable=");
                return oq.c(sb, this.c, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class d implements h {
            public final int b;
            public final int c;
            public final int d;

            public d(int i, int i2, int i3) {
                this.b = i;
                this.c = i2;
                this.d = i3;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof d)) {
                    return false;
                }
                d dVar = (d) obj;
                return this.b == dVar.b && this.c == dVar.c && this.d == dVar.d;
            }

            public final int hashCode() {
                return Integer.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadProgress(uploadId=");
                sb.append(this.b);
                sb.append(", progress=");
                sb.append(this.c);
                sb.append(", total=");
                return vu5.b(sb, this.d, ')');
            }
        }

        /* compiled from: PostingPatch.kt */
        /* renamed from: com.vk.newsfeed.posting.impl.domain.model.e$h$e, reason: collision with other inner class name */
        public static final class C1430e implements h {
            public final int b;
            public final int c;
            public final long d;

            public C1430e(int i, int i2, long j) {
                this.b = i;
                this.c = i2;
                this.d = j;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C1430e)) {
                    return false;
                }
                C1430e c1430e = (C1430e) obj;
                return this.b == c1430e.b && this.c == c1430e.c && this.d == c1430e.d;
            }

            public final int hashCode() {
                return Long.hashCode(this.d) + shy.a(this.c, Integer.hashCode(this.b) * 31, 31);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("UploadStart(oldUploadId=");
                sb.append(this.b);
                sb.append(", newUploadId=");
                sb.append(this.c);
                sb.append(", uploadSize=");
                return vu5.a(')', this.d, sb);
            }
        }
    }

    /* compiled from: PostingPatch.kt */
    public static final class i implements e {
        public final List<PostingRule> b;

        /* JADX WARN: Multi-variable type inference failed */
        public i(List<? extends PostingRule> list) {
            this.b = list;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof i) && epx.f(this.b, ((i) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return ms9.a(')', new StringBuilder("ValidateRules(additionalRules="), this.b);
        }
    }

    /* compiled from: PostingPatch.kt */
    public interface j extends e {

        /* compiled from: PostingPatch.kt */
        public static final class a implements j {
            public final PostingAction b;
            public final WaitingActionTrigger c;

            public a(PostingAction postingAction, WaitingActionTrigger waitingActionTrigger) {
                this.b = postingAction;
                this.c = waitingActionTrigger;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return epx.f(this.b, aVar.b) && this.c == aVar.c;
            }

            public final int hashCode() {
                return this.c.hashCode() + (this.b.hashCode() * 31);
            }

            public final String toString() {
                return "Add(action=" + this.b + ", trigger=" + this.c + ')';
            }
        }

        /* compiled from: PostingPatch.kt */
        public static final class b implements j {
            public final WaitingActionTrigger b;

            public b(WaitingActionTrigger waitingActionTrigger) {
                this.b = waitingActionTrigger;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof b) && this.b == ((b) obj).b;
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Clear(trigger=" + this.b + ')';
            }
        }
    }
}
