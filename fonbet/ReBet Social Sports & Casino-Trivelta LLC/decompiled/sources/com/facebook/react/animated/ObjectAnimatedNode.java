package com.facebook.react.animated;

import com.facebook.react.bridge.JavaOnlyArray;
import com.facebook.react.bridge.JavaOnlyMap;
import com.facebook.react.bridge.ReadableArray;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.bridge.ReadableMapKeySetIterator;
import com.facebook.react.bridge.ReadableType;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00152\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\tJ\u0014\u0010\u000f\u001a\u0004\u0018\u00010\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002J\u0014\u0010\u000f\u001a\u0004\u0018\u00010\t2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003H\u0002J\r\u0010\u0013\u001a\u00020\rH\u0010¢\u0006\u0002\b\u0014R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0016"}, d2 = {"Lcom/facebook/react/animated/ObjectAnimatedNode;", "Lcom/facebook/react/animated/AnimatedNode;", "config", "Lcom/facebook/react/bridge/ReadableMap;", "nativeAnimatedNodesManager", "Lcom/facebook/react/animated/NativeAnimatedNodesManager;", "<init>", "(Lcom/facebook/react/bridge/ReadableMap;Lcom/facebook/react/animated/NativeAnimatedNodesManager;)V", "configClone", "Lcom/facebook/react/bridge/JavaOnlyMap;", "collectViewUpdates", "", "propKey", "", "propsMap", "collectViewUpdatesHelper", "Lcom/facebook/react/bridge/JavaOnlyArray;", "source", "Lcom/facebook/react/bridge/ReadableArray;", "prettyPrint", "prettyPrint$ReactAndroid_release", "Companion", "ReactAndroid_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nObjectAnimatedNode.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ObjectAnimatedNode.kt\ncom/facebook/react/animated/ObjectAnimatedNode\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,127:1\n1#2:128\n*E\n"})
/* loaded from: classes2.dex */
public final class ObjectAnimatedNode extends AnimatedNode {

    @NotNull
    private static final String NODE_TAG_KEY = "nodeTag";

    @NotNull
    private static final String VALUE_KEY = "value";

    @NotNull
    private final JavaOnlyMap configClone;

    @NotNull
    private final NativeAnimatedNodesManager nativeAnimatedNodesManager;

    @Metadata(k = 3, mv = {2, 1, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ReadableType.values().length];
            try {
                iArr[ReadableType.Null.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ReadableType.Boolean.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ReadableType.Number.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ReadableType.String.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[ReadableType.Map.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[ReadableType.Array.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public ObjectAnimatedNode(@NotNull ReadableMap config, @NotNull NativeAnimatedNodesManager nativeAnimatedNodesManager) {
        Intrinsics.checkNotNullParameter(config, "config");
        Intrinsics.checkNotNullParameter(nativeAnimatedNodesManager, "nativeAnimatedNodesManager");
        this.nativeAnimatedNodesManager = nativeAnimatedNodesManager;
        this.configClone = JavaOnlyMap.INSTANCE.deepClone(config);
    }

    private final JavaOnlyArray collectViewUpdatesHelper(ReadableArray source) {
        if (source == null) {
            return null;
        }
        JavaOnlyArray javaOnlyArray = new JavaOnlyArray();
        int size = source.size();
        for (int i10 = 0; i10 < size; i10++) {
            switch (WhenMappings.$EnumSwitchMapping$0[source.getType(i10).ordinal()]) {
                case 1:
                    javaOnlyArray.pushNull();
                    break;
                case 2:
                    javaOnlyArray.pushBoolean(source.getBoolean(i10));
                    break;
                case 3:
                    javaOnlyArray.pushDouble(source.getDouble(i10));
                    break;
                case 4:
                    javaOnlyArray.pushString(source.getString(i10));
                    break;
                case 5:
                    ReadableMap map = source.getMap(i10);
                    if (map == null || !map.hasKey(NODE_TAG_KEY) || map.getType(NODE_TAG_KEY) != ReadableType.Number) {
                        javaOnlyArray.pushMap(collectViewUpdatesHelper(source.getMap(i10)));
                        break;
                    } else {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById == null) {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                        if (nodeById instanceof ValueAnimatedNode) {
                            ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                            Object objectValue = valueAnimatedNode.getObjectValue();
                            if (objectValue instanceof Integer) {
                                javaOnlyArray.pushInt(((Number) objectValue).intValue());
                                break;
                            } else if (objectValue instanceof String) {
                                javaOnlyArray.pushString((String) objectValue);
                                break;
                            } else {
                                javaOnlyArray.pushDouble(valueAnimatedNode.getValue());
                                break;
                            }
                        } else if (nodeById instanceof ColorAnimatedNode) {
                            javaOnlyArray.pushInt(((ColorAnimatedNode) nodeById).getColor());
                            break;
                        } else {
                            break;
                        }
                    }
                    break;
                case 6:
                    javaOnlyArray.pushArray(collectViewUpdatesHelper(source.getArray(i10)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return javaOnlyArray;
    }

    public final void collectViewUpdates(@NotNull String propKey, @NotNull JavaOnlyMap propsMap) {
        Intrinsics.checkNotNullParameter(propKey, "propKey");
        Intrinsics.checkNotNullParameter(propsMap, "propsMap");
        ReadableType type = this.configClone.getType("value");
        if (type == ReadableType.Map) {
            propsMap.putMap(propKey, collectViewUpdatesHelper(this.configClone.getMap("value")));
        } else {
            if (type != ReadableType.Array) {
                throw new IllegalArgumentException("Invalid value type for ObjectAnimatedNode");
            }
            propsMap.putArray(propKey, collectViewUpdatesHelper(this.configClone.getArray("value")));
        }
    }

    @Override // com.facebook.react.animated.AnimatedNode
    @NotNull
    public String prettyPrint$ReactAndroid_release() {
        return "ObjectAnimatedNode[" + this.tag + "]: mConfig: " + this.configClone;
    }

    private final JavaOnlyMap collectViewUpdatesHelper(ReadableMap source) {
        if (source == null) {
            return null;
        }
        JavaOnlyMap javaOnlyMap = new JavaOnlyMap();
        ReadableMapKeySetIterator keySetIterator = source.keySetIterator();
        while (keySetIterator.hasNextKey()) {
            String nextKey = keySetIterator.nextKey();
            switch (WhenMappings.$EnumSwitchMapping$0[source.getType(nextKey).ordinal()]) {
                case 1:
                    javaOnlyMap.putNull(nextKey);
                    break;
                case 2:
                    javaOnlyMap.putBoolean(nextKey, source.getBoolean(nextKey));
                    break;
                case 3:
                    javaOnlyMap.putDouble(nextKey, source.getDouble(nextKey));
                    break;
                case 4:
                    javaOnlyMap.putString(nextKey, source.getString(nextKey));
                    break;
                case 5:
                    ReadableMap map = source.getMap(nextKey);
                    if (map != null && map.hasKey(NODE_TAG_KEY) && map.getType(NODE_TAG_KEY) == ReadableType.Number) {
                        AnimatedNode nodeById = this.nativeAnimatedNodesManager.getNodeById(map.getInt(NODE_TAG_KEY));
                        if (nodeById != null) {
                            if (nodeById instanceof ValueAnimatedNode) {
                                ValueAnimatedNode valueAnimatedNode = (ValueAnimatedNode) nodeById;
                                Object objectValue = valueAnimatedNode.getObjectValue();
                                if (objectValue instanceof Integer) {
                                    javaOnlyMap.putInt(nextKey, ((Number) objectValue).intValue());
                                    break;
                                } else if (objectValue instanceof String) {
                                    javaOnlyMap.putString(nextKey, (String) objectValue);
                                    break;
                                } else {
                                    javaOnlyMap.putDouble(nextKey, valueAnimatedNode.getValue());
                                    break;
                                }
                            } else if (!(nodeById instanceof ColorAnimatedNode)) {
                                break;
                            } else {
                                javaOnlyMap.putInt(nextKey, ((ColorAnimatedNode) nodeById).getColor());
                                break;
                            }
                        } else {
                            throw new IllegalArgumentException("Mapped value node does not exist");
                        }
                    } else {
                        javaOnlyMap.putMap(nextKey, collectViewUpdatesHelper(map));
                        break;
                    }
                case 6:
                    javaOnlyMap.putArray(nextKey, collectViewUpdatesHelper(source.getArray(nextKey)));
                    break;
                default:
                    throw new NoWhenBranchMatchedException();
            }
        }
        return javaOnlyMap;
    }
}
