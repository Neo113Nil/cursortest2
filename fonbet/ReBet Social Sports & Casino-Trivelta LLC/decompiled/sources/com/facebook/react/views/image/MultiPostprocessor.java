package com.facebook.react.views.image;

import android.graphics.Bitmap;
import com.facebook.imagepipeline.request.d;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import w6.C6715f;
import w6.InterfaceC6713d;
import z7.AbstractC6940d;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0000\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0017\b\u0002\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ%\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\f0\u00102\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R \u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00010\u00028\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor;", "Lcom/facebook/imagepipeline/request/d;", "", "postprocessors", "<init>", "(Ljava/util/List;)V", "", "getName", "()Ljava/lang/String;", "Lw6/d;", "getPostprocessorCacheKey", "()Lw6/d;", "Landroid/graphics/Bitmap;", "sourceBitmap", "Lz7/d;", "bitmapFactory", "LH6/a;", "process", "(Landroid/graphics/Bitmap;Lz7/d;)LH6/a;", "Ljava/util/List;", "getPostprocessors$ReactAndroid_release", "()Ljava/util/List;", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nMultiPostprocessor.kt\nKotlin\n*S Kotlin\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,62:1\n1563#2:63\n1634#2,3:64\n*S KotlinDebug\n*F\n+ 1 MultiPostprocessor.kt\ncom/facebook/react/views/image/MultiPostprocessor\n*L\n26#1:63\n26#1:64,3\n*E\n"})
/* loaded from: classes2.dex */
public final class MultiPostprocessor implements d {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final List<d> postprocessors;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001f\u0010\u0007\u001a\u0004\u0018\u00010\u00052\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/facebook/react/views/image/MultiPostprocessor$Companion;", "", "<init>", "()V", "", "Lcom/facebook/imagepipeline/request/d;", "postprocessors", "from", "(Ljava/util/List;)Lcom/facebook/imagepipeline/request/d;", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @JvmStatic
        @Nullable
        public final d from(@NotNull List<? extends d> postprocessors) {
            Intrinsics.checkNotNullParameter(postprocessors, "postprocessors");
            int size = postprocessors.size();
            DefaultConstructorMarker defaultConstructorMarker = null;
            if (size != 0) {
                return size != 1 ? new MultiPostprocessor(postprocessors, defaultConstructorMarker) : postprocessors.get(0);
            }
            return null;
        }

        private Companion() {
        }
    }

    public /* synthetic */ MultiPostprocessor(List list, DefaultConstructorMarker defaultConstructorMarker) {
        this(list);
    }

    @JvmStatic
    @Nullable
    public static final d from(@NotNull List<? extends d> list) {
        return INSTANCE.from(list);
    }

    @Override // com.facebook.imagepipeline.request.d
    @NotNull
    public String getName() {
        return "MultiPostProcessor (" + CollectionsKt.joinToString$default(this.postprocessors, ",", null, null, 0, null, null, 62, null) + ")";
    }

    @Override // com.facebook.imagepipeline.request.d
    @NotNull
    public InterfaceC6713d getPostprocessorCacheKey() {
        List<d> list = this.postprocessors;
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((d) it.next()).getPostprocessorCacheKey());
        }
        return new C6715f(arrayList);
    }

    @NotNull
    public final List<d> getPostprocessors$ReactAndroid_release() {
        return this.postprocessors;
    }

    @Override // com.facebook.imagepipeline.request.d
    @NotNull
    public H6.a process(@NotNull Bitmap sourceBitmap, @NotNull AbstractC6940d bitmapFactory) {
        Intrinsics.checkNotNullParameter(sourceBitmap, "sourceBitmap");
        Intrinsics.checkNotNullParameter(bitmapFactory, "bitmapFactory");
        H6.a aVar = null;
        try {
            H6.a aVar2 = null;
            for (d dVar : this.postprocessors) {
                if (aVar2 != null && (r4 = (Bitmap) aVar2.z0()) != null) {
                    aVar = dVar.process(r4, bitmapFactory);
                    H6.a.U(aVar2);
                    aVar2 = aVar.clone();
                }
                Bitmap bitmap = sourceBitmap;
                aVar = dVar.process(bitmap, bitmapFactory);
                H6.a.U(aVar2);
                aVar2 = aVar.clone();
            }
            if (aVar != null) {
                H6.a clone = aVar.clone();
                Intrinsics.checkNotNullExpressionValue(clone, "clone(...)");
                H6.a.U(aVar);
                return clone;
            }
            throw new IllegalStateException(("MultiPostprocessor returned null bitmap - Number of Postprocessors: " + this.postprocessors.size()).toString());
        } catch (Throwable th2) {
            H6.a.U(null);
            throw th2;
        }
    }

    private MultiPostprocessor(List<? extends d> list) {
        this.postprocessors = new LinkedList(list);
    }
}
