package io.radar.sdk.util;

import android.content.Context;
import android.content.SharedPreferences;
import io.radar.sdk.RadarSettings;
import io.radar.sdk.model.RadarReplay;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.LinkedBlockingDeque;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: RadarSimpleReplayBuffer.kt */
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\tH\u0016J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\u0002\u001a\u00020\u0003H\u0002J\b\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\u000fH\u0016J\u0010\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lio/radar/sdk/util/RadarSimpleReplayBuffer;", "Lio/radar/sdk/util/RadarReplayBuffer;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "buffer", "Ljava/util/concurrent/LinkedBlockingDeque;", "Lio/radar/sdk/model/RadarReplay;", "getFlushableReplaysStash", "Lio/radar/sdk/util/Flushable;", "getSharedPreferences", "Landroid/content/SharedPreferences;", "getSize", "", "loadFromSharedPreferences", "", "write", "replayParams", "Lorg/json/JSONObject;", "Companion", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class RadarSimpleReplayBuffer implements RadarReplayBuffer {
    private static final Companion Companion = new Companion(null);

    @Deprecated
    public static final String KEY_REPLAYS = "radar-replays";

    @Deprecated
    public static final int MAXIMUM_CAPACITY = 120;

    @Deprecated
    public static final String PREFERENCES_NAME = "RadarReplayBufferPreferences";
    private final LinkedBlockingDeque<RadarReplay> buffer;
    private final Context context;

    public RadarSimpleReplayBuffer(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.buffer = new LinkedBlockingDeque<>(120);
    }

    /* compiled from: RadarSimpleReplayBuffer.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lio/radar/sdk/util/RadarSimpleReplayBuffer$Companion;", "", "()V", "KEY_REPLAYS", "", "MAXIMUM_CAPACITY", "", "PREFERENCES_NAME", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Override // io.radar.sdk.util.RadarReplayBuffer
    public int getSize() {
        return this.buffer.size();
    }

    @Override // io.radar.sdk.util.RadarReplayBuffer
    public void write(JSONObject replayParams) {
        Intrinsics.checkNotNullParameter(replayParams, "replayParams");
        if (this.buffer.size() >= 120) {
            this.buffer.removeFirst();
        }
        this.buffer.offer(new RadarReplay(replayParams));
        if (RadarSettings.INSTANCE.getSdkConfiguration(this.context).getUsePersistence()) {
            if (this.buffer.size() > 50) {
                LinkedBlockingDeque<RadarReplay> linkedBlockingDeque = this.buffer;
                ArrayList arrayList = new ArrayList();
                int i = 0;
                for (Object obj : linkedBlockingDeque) {
                    int i2 = i + 1;
                    if (i < 0) {
                        CollectionsKt.throwIndexOverflow();
                    }
                    if (i % 5 != 0) {
                        arrayList.add(obj);
                    }
                    i = i2;
                }
                ArrayList arrayList2 = arrayList;
                ArrayList arrayList3 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList2, 10));
                Iterator it = arrayList2.iterator();
                while (it.hasNext()) {
                    arrayList3.add(((RadarReplay) it.next()).toJson());
                }
                JSONArray jSONArray = new JSONArray((Collection) arrayList3);
                SharedPreferences.Editor editor = getSharedPreferences(this.context).edit();
                Intrinsics.checkNotNullExpressionValue(editor, "editor");
                editor.putString(KEY_REPLAYS, jSONArray.toString());
                editor.apply();
                return;
            }
            LinkedBlockingDeque<RadarReplay> linkedBlockingDeque2 = this.buffer;
            ArrayList arrayList4 = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedBlockingDeque2, 10));
            Iterator<T> it2 = linkedBlockingDeque2.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((RadarReplay) it2.next()).toJson());
            }
            JSONArray jSONArray2 = new JSONArray((Collection) arrayList4);
            SharedPreferences.Editor editor2 = getSharedPreferences(this.context).edit();
            Intrinsics.checkNotNullExpressionValue(editor2, "editor");
            editor2.putString(KEY_REPLAYS, jSONArray2.toString());
            editor2.apply();
        }
    }

    @Override // io.radar.sdk.util.RadarReplayBuffer
    public Flushable<RadarReplay> getFlushableReplaysStash() {
        final List list = CollectionsKt.toList(this.buffer);
        return new Flushable<RadarReplay>() { // from class: io.radar.sdk.util.RadarSimpleReplayBuffer$getFlushableReplaysStash$1
            @Override // io.radar.sdk.util.Flushable
            public List<RadarReplay> get() {
                return list;
            }

            @Override // io.radar.sdk.util.Flushable
            public void onFlush(boolean success) {
                LinkedBlockingDeque linkedBlockingDeque;
                LinkedBlockingDeque linkedBlockingDeque2;
                Context context;
                SharedPreferences sharedPreferences;
                if (success) {
                    linkedBlockingDeque = this.buffer;
                    linkedBlockingDeque.removeAll(list);
                    linkedBlockingDeque2 = this.buffer;
                    LinkedBlockingDeque linkedBlockingDeque3 = linkedBlockingDeque2;
                    ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(linkedBlockingDeque3, 10));
                    Iterator it = linkedBlockingDeque3.iterator();
                    while (it.hasNext()) {
                        arrayList.add(((RadarReplay) it.next()).toJson());
                    }
                    JSONArray jSONArray = new JSONArray((Collection) arrayList);
                    RadarSimpleReplayBuffer radarSimpleReplayBuffer = this;
                    context = radarSimpleReplayBuffer.context;
                    sharedPreferences = radarSimpleReplayBuffer.getSharedPreferences(context);
                    SharedPreferences.Editor editor = sharedPreferences.edit();
                    Intrinsics.checkNotNullExpressionValue(editor, "editor");
                    editor.putString(RadarSimpleReplayBuffer.KEY_REPLAYS, jSONArray.toString());
                    editor.apply();
                }
            }
        };
    }

    @Override // io.radar.sdk.util.RadarReplayBuffer
    public void loadFromSharedPreferences() {
        String string = getSharedPreferences(this.context).getString(KEY_REPLAYS, null);
        if (string != null) {
            JSONArray jSONArray = new JSONArray(string);
            int length = jSONArray.length();
            for (int i = 0; i < length; i++) {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                RadarReplay.Companion companion = RadarReplay.INSTANCE;
                Intrinsics.checkNotNull(jSONObject);
                this.buffer.offer(companion.fromJson(jSONObject));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SharedPreferences getSharedPreferences(Context context) {
        SharedPreferences sharedPreferences = context.getSharedPreferences(PREFERENCES_NAME, 0);
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "getSharedPreferences(...)");
        return sharedPreferences;
    }
}
